package edu.icet.studentmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "StudentDetails")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String StudentName;
    private String StudentAge;
    private String StudentContact;
    private String GuardianName;
    private String GuardianAddress;
    private String GuardianContact;

//    @Lob
//    private String profileImage;



}
