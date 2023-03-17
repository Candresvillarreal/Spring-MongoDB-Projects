package com.mongodb.firstapp.mongobd.repository;

import com.mongodb.firstapp.mongobd.entity.Student;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> findByName(String name);

}
