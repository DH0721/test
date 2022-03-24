package com.kissco.tt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kissco.tt.service.AdminService;
import com.kissco.tt.vo.AdminVO;


@Controller
public class AdminController {
	
	@Autowired
	private AdminService sv;
	
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm() {
		return "joinForm";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(AdminVO admin) {
		return sv.join(admin);
	}

}
