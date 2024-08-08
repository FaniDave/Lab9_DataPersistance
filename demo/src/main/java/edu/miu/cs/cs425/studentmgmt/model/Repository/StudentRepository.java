package edu.miu.cs.cs425.studentmgmt.model.Repository;

import edu.miu.cs.cs425.studentmgmt.model.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {


}
