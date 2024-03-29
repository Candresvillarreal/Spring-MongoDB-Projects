package com.mongodb.firstapp.mongobd.repository;

import com.mongodb.firstapp.mongobd.entity.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends MongoRepository<Subject, String> {

}
