package oa.jn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

import oa.jn.mapper.AprecordMapper;
import oa.jn.mapper.EmployeeMapper;
import oa.jn.mapper.HrMMapper;
import oa.jn.pojo.Aprecord;
import oa.jn.pojo.Employee;
import oa.jn.pojo.Record;

@Service
public class HrMServiceIml implements DubboHrMService {
	
	@Autowired
	private HrMMapper hrMMapper;
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Autowired
	private AprecordMapper aprecordMapper;
	
	@Override
	public List<Record> findAllRecord() {
		List<Record> recordList = hrMMapper.selectList(null);
		return recordList;
	}

	@Override
	public List<Employee> findAllEmpolyee() {
		List<Employee> list = employeeMapper.selectList(null);
		return list;
	}

	@Override
	public List<Aprecord> findAllAprecord() {
		List<Aprecord> list = aprecordMapper.selectList(null);
		return list;
	}

}
