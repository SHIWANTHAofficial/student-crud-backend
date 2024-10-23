package edu.icet.studentmanagementsystem.repository.impl;

import edu.icet.studentmanagementsystem.model.Student;
import edu.icet.studentmanagementsystem.repository.StudentJdbcRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class StudentRepositoryImpl implements StudentJdbcRepository {

    private  final JdbcTemplate JDBCTemplate;




    @Override
    public int updateStudent(Long id, Student student) {
        String sql = "UPDATE student_details SET student_name = ? , student_age = ?, student_contact=?, guardian_name=?,guardian_address=?,guardian_contact=? WHERE id =?";
        return  JDBCTemplate.update(sql, student.getStudentName(), student.getStudentAge(), student.getStudentContact(), student.getGuardianName(),student.getGuardianAddress(),student.getGuardianContact(),id);
    }
}
