package com.hcl.springData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository dao;
	int numRecords = 4;
	int numOfPage;

	@RequestMapping(value = "/")
	public ModelAndView getEmploy() {
	ModelAndView mv = new ModelAndView();
	List<Employee> employeeList = (List<Employee>) dao.findAll();
	numOfPage = employeeList.size() / numRecords + employeeList.size() % numRecords;
	mv.addObject("pages", numOfPage);
	mv.addObject("employeeList", employeeList);
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

	@RequestMapping("/displayAllSortByDesig")
	public ModelAndView displayAllSortByDesig() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeList", dao.findAll(Sort.by("desig")));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displayAllSortByDesigInDesc")
	public ModelAndView displayAllSortByDesigInDesc() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeList", dao.findAll(Sort.by("desig").descending()));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displayAllSortBySalAndDeptInDesc")
	public ModelAndView displayAllSortBySalAndDeptInDesc() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeList", dao.findAll(Sort.by("basic", "dept").descending()));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displayJavaEmpSortBySalInDesc")
	public ModelAndView displayJavaEmpSortBySalInDesc() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeList", dao.findAll(Sort.by("basic").descending()));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/displayAll/page/{pageno}")
	public ModelAndView displayAllSortByDesign(@PathVariable("pageno") int pageno) {
	ModelAndView mv = new ModelAndView();
	Page<Employee> pages = dao.findAll(PageRequest.of(pageno, numRecords));
	mv.addObject("pages", numOfPage);
	mv.addObject("employeeList", (pages).getContent());
	mv.setViewName("home");
	return mv;
	}
	
	
}