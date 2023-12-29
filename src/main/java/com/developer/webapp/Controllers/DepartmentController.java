package com.developer.webapp.Controllers;

import com.developer.webapp.Entities.Department;
import com.developer.webapp.Repositories.DepartmentRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;


@Controller
public class DepartmentController{
    @Autowired
    private DepartmentRepository departmentRepository;
    @GetMapping(path = "/department")
    public String getAllDepartment(Model model){
        List<Department> departmentList = (List<Department>) departmentRepository.findAll();
        model.addAttribute(departmentList);
        return "department/index";
    }
    @GetMapping(path = "add/department")
    public String createDepartment(Department departmentForm){
        return "department/create";
    }

    @PostMapping(path = "add/department")
    public String create(@Valid Department department, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "department/create";
        }
        departmentRepository.save(department);
        return "redirect:/department";
    }
    @GetMapping(path = "update/department/{id}")
    public String update(@PathVariable Long id, Model model){
        model.addAttribute("department",departmentRepository.findById(id).orElse(null));
        return "/department/update";
    }
    @PostMapping(path = "update/department")
    public String update(@Valid Department department, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "department/update";
        }
        departmentRepository.save(department);
        return "redirect:/department";
    }
    @GetMapping(path = "delete/department/{id}")
    public String delete(@PathVariable Long id, Model model){
        model.addAttribute("department",departmentRepository.findById(id).orElse(null));
        return "/department/delete";
    }
    @PostMapping(path = "delete/department")
    public String delete(@Valid Department department, BindingResult bindingResult){
        System.out.println(department.getId());
        departmentRepository.deleteById(department.getId());
        return "redirect:/department";
    }
}
