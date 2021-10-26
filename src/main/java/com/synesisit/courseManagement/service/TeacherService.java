package com.synesisit.courseManagement.service;

import com.synesisit.courseManagement.entity.Department;
import com.synesisit.courseManagement.entity.Teacher;
import com.synesisit.courseManagement.repository.CourseRepository;
import com.synesisit.courseManagement.repository.DepartmentRepository;
import com.synesisit.courseManagement.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private DepartmentRepository departmentRepository;

    public Teacher addTeacher(Teacher teacherRequest) {
        return teacherRepository.save(teacherRequest);


    }

    public List<Teacher> addTeacherList(List<Teacher> teacherRequest) {
        return teacherRepository.saveAll(teacherRequest);
    }

    public List<Teacher> getTeacherAll() {
        return teacherRepository.findAll();
    }

    public Teacher getSingleTeacher(Long teacherId) {

        Teacher teacher = null;
        if (teacherRepository.findById(teacherId).get().isExist() == true) {
            teacher = teacherRepository.findById(teacherId).get();
        } else {
            System.out.println("This Id Is not Active or doesn't Exist");
        }
        return teacher;
    }

    public Teacher updateTeacher(Long teacherId, Teacher teacherRequest) {

        Teacher teacher = teacherRepository.getById(teacherId);
        teacher.setTeacherFirstName(teacherRequest.getTeacherFirstName());
        teacher.setTeacherLastName(teacherRequest.getTeacherLastName());

        teacher.setDepartment(teacherRequest.getDepartment());
        teacher.setCourseList(teacherRequest.getCourseList());

        return teacherRepository.save(teacher);
    }


    public Teacher addDepartmentToTeacher(Long teacherId, Long departmentId) {
        Teacher teacher = teacherRepository.findById(teacherId).get();
        Department department = departmentRepository.findById(departmentId).get();
        teacher.setDepartment(department);
        department.enrolledTeacher(teacher);
        departmentRepository.save(department);
        return teacherRepository.save(teacher);

    }
}
