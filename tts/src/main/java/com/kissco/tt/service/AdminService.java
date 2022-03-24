package com.kissco.tt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kissco.tt.dao.AdminDAO;
import com.kissco.tt.vo.AdminVO;

@Service
public class AdminService {
	
	@Autowired
	private AdminDAO dao;
	
	public String join(AdminVO admin) {
		String path = "";
		int cnt = dao.join(admin);
		
		if(cnt>0) {
			path="redirect:/";
		} else {
			path="redirect:/joinForm";
		}
		return path;
	}

}
