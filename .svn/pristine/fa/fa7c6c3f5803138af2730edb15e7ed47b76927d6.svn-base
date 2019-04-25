package oa.jn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;

import oa.jn.pojo.User;
import oa.jn.service.UserService;

@Controller
public class PageController {
	
	@Reference(timeout=3000,check=false)
	UserService userService;
	
	@RequestMapping("/index")
	public String index(Model model) {
		User user = userService.findUserById(1);
		model.addAttribute("user",user);
		return "index";
	}
}
