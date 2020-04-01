package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmpDao;
import com.example.demo.vo.EmpVo;
import com.google.gson.Gson;

@RestController
public class EmpController {
	
	@Autowired
	private EmpDao dao;

	public void setDao(EmpDao dao) {
		this.dao = dao; 
		
	}

	@RequestMapping(value="/listEmp", produces = "application/json;charset=UTF-8")
	public String listEmp() {
		String str = "";
		Gson gson = new Gson();
		str = gson.toJson(dao.listEmp());
		return str;
	}
	
}
