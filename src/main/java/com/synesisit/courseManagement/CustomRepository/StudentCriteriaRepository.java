package com.synesisit.courseManagement.CustomRepository;

import com.synesisit.courseManagement.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentCriteriaRepository {

    List<Student> findStudentByStudentFirstNameAndStudentLastName(String studentFirstName, String studentLastName);

}
