package oa.jn.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@TableName("user")
@Accessors(chain=true)
public class User extends BasePojo {
	
	/**
	 * 
	 */
	
	@TableId(type=IdType.AUTO)   //主键自增
	private Long   id;			 //用户id
	private String username;	 //用户名
	//private String password;	 //密码
	private Integer age;
	private String phone;		 //手机
	//private String email;		 //邮箱
}
