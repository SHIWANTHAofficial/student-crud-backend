package edu.icet.studentmanagementsystem.service;

import edu.icet.studentmanagementsystem.entity.StudentEntity;
import edu.icet.studentmanagementsystem.model.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student) ;
    public List<StudentEntity> getAllStudents();
    public boolean deleteStudent(Long Id);
    StudentEntity getStudentById (Long id);
  int updateStudent (Long id, Student student);


}
