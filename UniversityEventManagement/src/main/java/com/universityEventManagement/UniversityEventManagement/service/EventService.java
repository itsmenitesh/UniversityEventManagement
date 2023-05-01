package com.universityEventManagement.UniversityEventManagement.service;

import com.universityEventManagement.UniversityEventManagement.module.DepartmentType;
import com.universityEventManagement.UniversityEventManagement.module.Event;
import com.universityEventManagement.UniversityEventManagement.module.Student;
import com.universityEventManagement.UniversityEventManagement.repository.IEventRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    IEventRepository iEventRepository;

    //getAllEvent
    public Iterable<Event> getAllEvent(){
        Iterable<Event> allEvent = iEventRepository.findAll();
        return  allEvent;
    }

    //addStudent
    public String addEvent(List<Event> eventList){
        Iterable<Event> addEvent = iEventRepository.saveAll(eventList);
        if(addEvent !=null){
            return "Student Data Added ";
        }else{
            return "There no data provided";
        }
    }


    //removeEventById
    public void removeEventById(Integer id){
        iEventRepository.deleteById(id);
    }


    //getEVentByDate
    public List<Event> getEventsBasedOnDate(String date) {
        if(date==null){
            return (List<Event>) iEventRepository.findAll();
        }
        LocalDate localDate = LocalDate.parse(date);
        return iEventRepository.findByDate(localDate);
    }

    //updateEventByEventLocation
    @Transactional
    public String updateEventByEventLocation(Integer id, Event locationOfEvent){
        Optional<Event>  listEvent = iEventRepository.findById(id);
        String EventLocationOfEvent = locationOfEvent.toString();
        if(!(listEvent.isEmpty())){
            iEventRepository.updateEventLocationOfEvent(id , EventLocationOfEvent);
            return "Updated";
        }else{
            return "Data not found";
        }
    }

}
