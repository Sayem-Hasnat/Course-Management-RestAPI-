package com.synesisit.courseManagement.service;

import com.synesisit.courseManagement.entity.Department;
import com.synesisit.courseManagement.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
@Autowired
    DepartmentRepository departmentRepository;


    public Department save(Department departmentRequest) {
        return  departmentRepository.save(departmentRequest);
    }

    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    public Department getSingleDepartment(Long departmentId) {
        return  departmentRepository.findById(departmentId).get();
    }

    public List<Department> saveAllDepartment(List<Department> departmentRequestList) {
        return  departmentRepository.saveAll(departmentRequestList);
    }
}
