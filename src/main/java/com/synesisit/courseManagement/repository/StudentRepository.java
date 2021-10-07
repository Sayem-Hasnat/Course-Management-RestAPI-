package com.synesisit.courseManagement.repository;

import com.synesisit.courseManagement.CustomRepository.StudentCriteriaRepository;
import com.synesisit.courseManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends StudentCriteriaRepository, JpaRepository<Student, Long> {

    @Query
    List<Student> findAllByIsExistTrue();
    // Student findByStudentName(String studentFirstName);


}
