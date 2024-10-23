package edu.icet.studentmanagementsystem.repository;

import edu.icet.studentmanagementsystem.entity.StudentEntity;
import edu.icet.studentmanagementsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
