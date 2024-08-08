package edu.miu.cs.cs425.studentmgmt.model.Service.Impl;

import edu.miu.cs.cs425.studentmgmt.model.Entity.Student;
import edu.miu.cs.cs425.studentmgmt.model.Repository.StudentRepository;
import edu.miu.cs.cs425.studentmgmt.model.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

       @Autowired
       private StudentRepository studentRepository;


       public void save(Student student) {
           studentRepository.save(student);
       }

}
