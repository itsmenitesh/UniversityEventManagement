package com.universityEventManagement.UniversityEventManagement.module;


import jakarta.persistence.*;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Student_table")
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_Id")
   private Integer id;

    @Pattern(regexp = "[A-Z][a-z]*" , message = "First word will be in capital")
    private String firstName;

    private String lastName;

    @Min(value = 18)
    @Max(value = 25 )
    private int  age;
    @Enumerated(EnumType.STRING)
    private DepartmentType department;
}
