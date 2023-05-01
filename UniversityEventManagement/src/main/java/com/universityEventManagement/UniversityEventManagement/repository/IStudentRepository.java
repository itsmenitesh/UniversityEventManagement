package com.universityEventManagement.UniversityEventManagement.repository;

import com.universityEventManagement.UniversityEventManagement.module.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends CrudRepository<Student , Integer> {

    @Modifying
    @Query(value = "update Student_table set department = :department where student_Id = :id",nativeQuery = true)
    void updateStudentDepartment(Integer id , String department);
}
