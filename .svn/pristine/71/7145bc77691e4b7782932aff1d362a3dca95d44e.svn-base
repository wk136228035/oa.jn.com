package oa.jn.util;

import javax.management.RuntimeErrorException;

import org.mybatis.spring.annotation.MapperScan;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 该工具类解决对象转化中的try-catch问题
 * 1.对象转json toJson
 * 2.json转对象  toObject
 * @author tarena
 *
 */
public class ObjectMapperUtil {
	
	//是否有线程安全问题  答案:不会因为调用的是方法
	private static final ObjectMapper mapper
								= new ObjectMapper();
	
	public static String toJSON(Object obj) {
		String json = null;
		try {
			json = mapper.writeValueAsString(obj);
		} catch (Exception e) {
			e.printStackTrace();
			//如果报错需要转化为运行时异常
			throw new RuntimeException();
		}
		return json;
	}
	
	public static <T>T toObject(String json,Class<T> cls){
		T t = null;
		try {
			t = mapper.readValue(json, cls);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		return t;
	}
}
