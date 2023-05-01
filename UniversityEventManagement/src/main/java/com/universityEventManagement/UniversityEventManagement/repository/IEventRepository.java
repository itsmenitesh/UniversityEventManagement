package com.universityEventManagement.UniversityEventManagement.repository;

import com.universityEventManagement.UniversityEventManagement.module.Event;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEventRepository extends CrudRepository<Event ,Integer> {

    List<Event> findByDate(LocalDate localDate);


    @Modifying
    @Query(value = "update Event_table set locationOfEvent = :locationOfEvent where Event_Id = :id",nativeQuery = true)
    void updateEventLocationOfEvent(Integer id , String locationOfEvent);
}
