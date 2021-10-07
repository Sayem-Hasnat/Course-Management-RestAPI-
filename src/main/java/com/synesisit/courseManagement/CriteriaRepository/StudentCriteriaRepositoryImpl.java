package com.synesisit.courseManagement.CriteriaRepository;

import com.synesisit.courseManagement.CustomRepository.StudentCriteriaRepository;
import com.synesisit.courseManagement.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class StudentCriteriaRepositoryImpl implements StudentCriteriaRepository {
    @Autowired
    EntityManager entityManager;

    // constructor
    @Override
    public List<Student> findStudentByStudentFirstNameAndStudentLastName(String studentFirstName, String studentLastName) {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);

        Root<Student> studentRoot = criteriaQuery.from(Student.class);
        Predicate firstNamePredicate = criteriaBuilder.equal(studentRoot.get("firstName"), studentFirstName);
        Predicate lastNamePredicate = criteriaBuilder.equal(studentRoot.get("lastName"), studentLastName);
        criteriaQuery.where(firstNamePredicate, lastNamePredicate);

        TypedQuery<Student> studentTypedQuery = entityManager.createQuery(criteriaQuery);
        return studentTypedQuery.getResultList();


    }


}

