package edu.icet.studentmanagementsystem.repository;

import edu.icet.studentmanagementsystem.model.Student;

public interface StudentJdbcRepository {
    public int updateStudent(Long id, Student student);
}
