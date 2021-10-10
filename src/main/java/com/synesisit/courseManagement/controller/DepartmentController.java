package com.synesisit.courseManagement.controller;

import com.synesisit.courseManagement.entity.Department;
import com.synesisit.courseManagement.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/department")
    public List<Department> addDepartment(@RequestBody List<Department> departmentRequestList){
        return departmentService.saveAllDepartment(departmentRequestList);
    }



    @GetMapping("/department")
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartment();
    }

    @GetMapping("/department/{departmentId}")
    public Department getDepartment(@PathVariable Long departmentId){
        return departmentService.getSingleDepartment(departmentId);
    }

}
