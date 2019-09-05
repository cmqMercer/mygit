package com.example.demo.controller;

import com.example.demo.dao.DepartmentDao;
import com.example.demo.dao.EmployeeDao;
import com.example.demo.entities.Department;
import com.example.demo.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
EmployeeDao employeeDao;
@Autowired
    DepartmentDao departmentDao;

@GetMapping("/emps")
    public String list(Model model){

    Collection<Employee> emps = employeeDao.getAll();
    model.addAttribute("emps",emps);
    return  "emp/list";
    }

    @GetMapping("/emp")
    public  String toAddPage(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
    return "emp/add";
    }

@PostMapping("/emp")
    public  String addEmp(Employee employee){

    employeeDao.save(employee);
    return "redirect:/emps";
    }

}
