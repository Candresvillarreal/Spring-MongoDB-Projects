package com.mongodb.firstapp.mongobd.repository;

import com.mongodb.firstapp.mongobd.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {

}
