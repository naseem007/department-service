package com.techsoft.departmentservice.service;

import com.techsoft.departmentservice.entity.Department;
import com.techsoft.departmentservice.repository.DepartmentRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);

    }

    public void deleteDepartmentById(Long departmentId) {
        log.info("Inside deleteDepartmentById of DepartmentService");
         departmentRepository.deleteById(departmentId);
    }
}
