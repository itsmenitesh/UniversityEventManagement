package com.universityEventManagement.UniversityEventManagement.service;

import com.universityEventManagement.UniversityEventManagement.module.DepartmentType;
import com.universityEventManagement.UniversityEventManagement.module.Student;
import com.universityEventManagement.UniversityEventManagement.repository.IStudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepository iStudentRepository;

    //getAllStudent
    public Iterable<Student> getAllStudent(){
        Iterable<Student> allStudent = iStudentRepository.findAll();
        return  allStudent;
    }

    //addStudent
    public String addStudent(List<Student> studentList){
        Iterable<Student> addStudents = iStudentRepository.saveAll(studentList);
        if(addStudents !=null){
            return "Student Data Added ";
        }else{
            return "There no data provided";
        }
    }

    //removeStudentById
    public void removeStudentById(Integer id){
        iStudentRepository.deleteById(id);
    }


    //getStudentById
    public List<Optional<Student>> fetchStudentById(Integer id){
        List<Optional<Student>> listStudent = new ArrayList<>();
        listStudent.add(iStudentRepository.findById(id));
        return listStudent;
    }

    ////updateStudentByDepartment
@Transactional
    public String updateStudentDepartment(Integer id, DepartmentType department){
        Optional<Student>  listStudent = iStudentRepository.findById(id);
        String studentDepartment = department.toString();
        if(!(listStudent.isEmpty())){
            iStudentRepository.updateStudentDepartment(id , studentDepartment);
            return "Updated";
        }else{
            return "Data not found";
        }
    }

}
