package oa.jn.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;

import oa.jn.pojo.Aprecord;
import oa.jn.pojo.Employee;
import oa.jn.pojo.Record;
import oa.jn.service.DubboHrMService;

@RequestMapping("/hrm")
@Controller
public class HrMController {
	
	@Reference(timeout=3000,check=false)
	private DubboHrMService hrMService;
	
	@RequestMapping("/record_manage")
	public String recordManage(Model model) {
		List<Record> recordList = hrMService.findAllRecord();
		model.addAttribute("recordList", recordList);
		return "record_manage";
	}
	
	@RequestMapping("/employee")
	public String employee(Model model) {
		List<Employee> list = hrMService.findAllEmpolyee();
		model.addAttribute("list", list);
		return "employee";
	}
	
	@RequestMapping("/aprecord")
	public String aprecord(Model model) {
		List<Aprecord> list = hrMService.findAllAprecord();
		model.addAttribute("list", list);
		return "aprecord";
	}
}
