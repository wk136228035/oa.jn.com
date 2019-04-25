package oa.jn.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;


@Data
@Accessors(chain=true)
@TableName("employee")
public class Employee extends BasePojo {
	@TableId(type=IdType.AUTO)
	private Long id;
	private String name;
	private Integer age;
	private String phone;
	private String email;
	private String study;
	private String description;
}
