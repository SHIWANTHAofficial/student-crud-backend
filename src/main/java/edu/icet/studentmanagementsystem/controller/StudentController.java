package edu.icet.studentmanagementsystem.controller;

import edu.icet.studentmanagementsystem.entity.StudentEntity;
import edu.icet.studentmanagementsystem.model.Student;
import edu.icet.studentmanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin
    @RestController
    @RequestMapping("/students")
    public class StudentController {

        @Autowired
        private StudentService studentService;


        @GetMapping
        public List<StudentEntity> getAllStudents() {
            return studentService.getAllStudents();
        }

        @PostMapping
        public Student createStudent(@RequestBody Student student) {
            System.out.println(student);
            return studentService.saveStudent(student);
        }

        @GetMapping("/{id}")
        public StudentEntity getStudentById(@PathVariable Long id) {
            return studentService.getStudentById(id);
        }

        @DeleteMapping("/{id}")
        public boolean deleteStudent(@PathVariable Long id) {

            return  studentService.deleteStudent(id);
        }

        @PutMapping("/{id}")
    public boolean updateStudent(@PathVariable Long id, @RequestBody Student student) {
        int i = studentService.updateStudent(id, student);
        if (i>0 ) return true;
        return  false;
    }


    }

