package oa.jn.pojo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain=true)
@Data
@TableName("emp_record")
public class Record implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4460934192888677541L;
	@TableId(type=IdType.AUTO)
	private Long id;
	private Long employeeId;
	private String employeeJob;
	private Integer employeeStatus;
	private Date employeeCreated;
	private Date employeeUpdated;
}
