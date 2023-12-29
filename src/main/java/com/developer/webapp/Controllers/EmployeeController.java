package com.developer.webapp.Controllers;

import com.developer.webapp.Entities.Department;
import com.developer.webapp.Entities.Employee;
import com.developer.webapp.Repositories.EmployeeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping(path = "/employee")
    public String employee(Model model){
        List<Employee> employeeList = (List<Employee>) employeeRepository.findAll();
        model.addAttribute("employees",employeeList);
        return "employee/index";
    }
    @GetMapping(path = "add/employee")
    public String createEmployee(Employee employeeForm){
        return "employee/create";
    }
    @PostMapping(path = "add/employee")
    public String create(@Valid Employee employee, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "employee/create";
        }
        employeeRepository.save(employee);
        return "redirect:/employee";
    }

    @GetMapping(path = "update/employee/{id}")
    public String update(@PathVariable Long id, Model model){
        model.addAttribute("employee",employeeRepository.findById(id).orElse(null));
        return "/employee/update";
    }
    @PostMapping(path = "update/employee")
    public String update(@Valid Employee employee, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "employee/update";
        }
        employeeRepository.save(employee);
        return "redirect:/employee";
    }
    @GetMapping(path = "delete/employee/{id}")
    public String delete(@PathVariable Long id, Model model){
        model.addAttribute("employee",employeeRepository.findById(id).orElse(null));
        return "/employee/delete";
    }
    @PostMapping(path = "delete/employee")
    public String delete(@Valid Employee employee, BindingResult bindingResult){
        System.out.println(employee.getId());
        employeeRepository.deleteById(employee.getId());
        return "redirect:/employee";
    }

}
