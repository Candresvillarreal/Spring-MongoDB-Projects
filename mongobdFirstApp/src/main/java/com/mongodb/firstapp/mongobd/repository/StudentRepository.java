package com.mongodb.firstapp.mongobd.repository;

import com.mongodb.firstapp.mongobd.entity.Student;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> findByName(String name);

    Student findByNameAndEmail(String name, String mail);

    List<Student> findByNameOrEmail(String name, String mail);

    List<Student> findByDepartmentDepartmentName(String deparmentName);

    List<Student> findBySubjectsSubjectName(String subjectName);

    List<Student> findByEmailIsLike(String email);

    List<Student> findByNameStartsWith(String name);

    List<Student> findByDepartmentId (String departmentId);

}
