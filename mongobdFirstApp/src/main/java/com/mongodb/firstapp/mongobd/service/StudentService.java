package com.mongodb.firstapp.mongobd.service;

import com.mongodb.firstapp.mongobd.entity.Student;
import com.mongodb.firstapp.mongobd.repository.DepartmentRepository;
import com.mongodb.firstapp.mongobd.repository.StudentRepository;
import com.mongodb.firstapp.mongobd.repository.SubjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    SubjectRepository subjectRepository;

    public Student createStudent(Student student) {
        if (student.getDepartment() != null){
            departmentRepository.save(student.getDepartment());
        }
        if (student.getSubjects() != null && student.getSubjects().size() > 0) {
            subjectRepository.saveAll(student.getSubjects());
        }
        return studentRepository.save(student);
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).get();
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public String deleteStudent(String id) {
        studentRepository.deleteById(id);
        return "Student has been deleted";
    }

    public List<Student> getStudentsByName(String name) {
          return studentRepository.findByName(name);
    }

    public Student studentsByNameAndEmail(String name, String mail) {
            return studentRepository.findByNameAndEmail(name, mail);
    }

    public List<Student> studentsByNameOrMail(String name, String mail) {
        return studentRepository.findByNameOrEmail(name, mail);
    }

    public List<Student> getAllWithPagination(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber - 1, pageSize);
        return studentRepository.findAll(pageable).getContent();
    }

    public List<Student> allWithSorting() {
        Sort sort = Sort.by(Sort.Direction.ASC, "name");
        return studentRepository.findAll(sort);
    }

    public List<Student> byDepartmentName(String departmentName) {
        return studentRepository.findByDepartmentDepartmentName(departmentName);

    }

    public List<Student> bySubjectName(String subjectName) {
        return studentRepository.findBySubjectsSubjectName(subjectName);

    }

    public List<Student> emailLike(String email) {
        return studentRepository.findByEmailIsLike(email);

    }

    public List<Student> nameStartsWith(String name) {
        return studentRepository.findByNameStartsWith(name);
    }

    public List<Student> byDepartmentId(String departmentId) {
        return studentRepository.findByDepartmentId(departmentId);
    }
}
