package com.techsoft.departmentservice.controller;

import com.techsoft.departmentservice.entity.Department;
import com.techsoft.departmentservice.service.DepartmentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public  Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside findDepartmentById of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }
    @DeleteMapping("{id}")
    public void deleteDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside deleteDepartmentById of DepartmentController");
        departmentService.deleteDepartmentById(departmentId);
    }
}
