package edu.icet.studentmanagementsystem.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String StudentName;
    private String StudentAge;
    private String StudentContact;
    private String GuardianName;
    private String GuardianAddress;
    private String GuardianContact;
}
