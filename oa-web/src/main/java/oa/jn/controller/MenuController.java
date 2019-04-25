package oa.jn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;

import oa.jn.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Reference(timeout=3000,check=false)
	private MenuService menuService;
	
	@RequestMapping("")
	public String findMenuList() {
		
		return "";
	}
}

