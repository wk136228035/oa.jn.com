package oa.jn.controller;



import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;


import oa.jn.pojo.advice;
import oa.jn.service.DubboAdviceService;

@Controller
@RequestMapping("/yinyong")
public class AdviceController {
	
	@Reference(timeout=3000,check=false)
	private DubboAdviceService dubboAdviceService;
	@RequestMapping("/advice")
	public String advice(Model model) {
	   List<advice> advices=dubboAdviceService.findAllAdvice();
	   model.addAttribute("advice", advices);
	   return "advice";
	}

}
