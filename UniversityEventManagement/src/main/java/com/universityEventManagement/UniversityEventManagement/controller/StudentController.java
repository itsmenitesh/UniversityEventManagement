package com.universityEventManagement.UniversityEventManagement.controller;

import com.universityEventManagement.UniversityEventManagement.module.DepartmentType;
import com.universityEventManagement.UniversityEventManagement.module.Student;
import com.universityEventManagement.UniversityEventManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    //GetAllStudent
    @GetMapping(value = "/allStudent")
    public Iterable<Student> getStudent(){
        return studentService.getAllStudent();
    }

    //AddStudent
    @PostMapping(value = "/addStudent")
    public String insertStudent(@RequestBody List<Student> studentList){
        return studentService.addStudent(studentList);
    }

    //GetStudentById
    @GetMapping(value = "/student/{id}")
    public List<Optional<Student>> getStudentById(@PathVariable Integer id){
        return studentService.fetchStudentById(id);
    }

    //removeStudent
    @DeleteMapping(value = "/student/{id}")
    public void deleteStudentById(@PathVariable Integer id){
        studentService.removeStudentById(id);
    }

    //updateStudentByDepartment
   @PutMapping(value = "/student/{id}/{department}")
    public String updateStudentByDepartment(@PathVariable Integer id , @PathVariable DepartmentType department){
        return studentService.updateStudentDepartment(id,department);
   }



    /////////////////////////////////////////////////////////////////

}
