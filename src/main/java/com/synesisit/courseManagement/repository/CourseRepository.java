package com.synesisit.courseManagement.repository;

import com.synesisit.courseManagement.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query
    List<Course> findAllByIsExistTrue();
}
