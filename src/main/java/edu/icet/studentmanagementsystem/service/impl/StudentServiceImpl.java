package edu.icet.studentmanagementsystem.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.studentmanagementsystem.entity.StudentEntity;
import edu.icet.studentmanagementsystem.model.Student;
import edu.icet.studentmanagementsystem.repository.StudentJdbcRepository;
import edu.icet.studentmanagementsystem.repository.StudentRepository;
import edu.icet.studentmanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private final ObjectMapper mapper;
    private final StudentRepository studentRepository;
    private final StudentJdbcRepository studentJdbcRepository;



    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }



    public StudentEntity getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public boolean deleteStudent(Long id) {
        Optional<StudentEntity> result = studentRepository.findById(id);
        if (result.isEmpty())return false;
        studentRepository.deleteById(id);
        return true;
    }



    public Student saveStudent(Student student) {
        StudentEntity result = studentRepository.save(mapper.convertValue(student, StudentEntity.class));
        return mapper.convertValue(result, Student.class);

    }


    public int updateStudent (Long id, Student student){
        return studentJdbcRepository.updateStudent(id,student);
    }


}
