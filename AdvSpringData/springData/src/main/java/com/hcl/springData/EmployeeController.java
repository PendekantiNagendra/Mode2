package com.hcl.springData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository dao;

	@RequestMapping("/")
	public ModelAndView getEmployees() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeList", dao.findAll());
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("/displayjavacontractors")
	public ModelAndView getJavaContractors() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeList", dao.findByDeptAndDesig("Java", "developer"));
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("/displayjavaemployees")
	public ModelAndView getJavaEmployees() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeList", dao.findByDeptAndBasic("Full", 54210));
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("/displayjavamanagers")
	public ModelAndView getJavaManagers() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeList", dao.findByDept("js"));
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("/displayjavamanagersalary")
	public ModelAndView getJavaManagerSalary() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeList", dao.findByBasic(70000));
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("/displayjavaemployeesalname")
	public ModelAndView getJavaManagerSalName() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeList", dao.findByBasicAndName(80000, ""));
		mv.setViewName("home");
		return mv;
	}

}