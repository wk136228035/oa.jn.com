package oa.jn.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@TableName("aprecord")
@Accessors(chain=true)
@Data
public class Aprecord extends BasePojo {
	
	private Long id;
	private Long employeeId;
	private Integer type;
	private String description;
	private String main;
}
