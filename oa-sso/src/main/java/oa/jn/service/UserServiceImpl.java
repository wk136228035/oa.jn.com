package oa.jn.service;


import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import oa.jn.mapper.UserMapper;
import oa.jn.pojo.User;
import redis.clients.jedis.JedisCluster;

@Service(timeout=5000)
public class UserServiceImpl implements UserService  {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public User findUserById(Integer id) {
		return userMapper.selectById(id);
	}
	
}
