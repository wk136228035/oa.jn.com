package oa.jn.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import oa.jn.pojo.User;
import oa.jn.util.ObjectMapperUtil;
import oa.jn.util.UserThreadLocal;

import redis.clients.jedis.JedisCluster;

@Component
public class UserInterceptor implements HandlerInterceptor {
	
	@Autowired(required=false)
	JedisCluster jedisCluster;
	
	//完成用户校验,如果没有登录 则跳转用户登录页
	//如果用户已经登录
	//boolean:true放行,false:拦截 +重定向
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//1.获取用户cookie数据
		Cookie[] cookies = request.getCookies();
		
		String token = null;
		for (Cookie cookie : cookies) {
			if("JT_TICKET".equals(cookie.getName())) {
				token = cookie.getValue();
				break;
			}
		}
		//2.用户是否已经登录
		//3.如果用户没有登录则跳转到用户登录页面
		if(!StringUtils.isEmpty(token)) {
			//4.如果用户已经登录,则判断redis中是否有数据
			String userJson = jedisCluster.get(token);
			if(!StringUtils.isEmpty(userJson)) {
//				request.setAttribute("JT_USER", 
//						ObjectMapperUtil.toObject(userJson, User.class));
				System.out.println("拦截器启动将数据放入ThreadLocal");
				UserThreadLocal.set(ObjectMapperUtil.toObject(userJson, User.class));
				return true;
			}
		}
		response.sendRedirect("/user/login.html");
		return false;
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("用户使用完成,清除数据");
		UserThreadLocal.remove();
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
}
