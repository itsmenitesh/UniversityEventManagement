package com.universityEventManagement.UniversityEventManagement.controller;

import com.universityEventManagement.UniversityEventManagement.module.DepartmentType;
import com.universityEventManagement.UniversityEventManagement.module.Event;
import com.universityEventManagement.UniversityEventManagement.module.Student;
import com.universityEventManagement.UniversityEventManagement.service.EventService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;

    //GetAllEvent
    @GetMapping(value = "/allEvent")
    public Iterable<Event> getEvent(){
        return eventService.getAllEvent();
    }

    //AddEvent
    @PostMapping(value = "/addEvent")
    public String insertEvent(@RequestBody List<Event> eventList){
        return eventService.addEvent(eventList);
    }

    //removeEvent
    @DeleteMapping(value = "/event/{id}")
    public void deleteEventById(@PathVariable Integer id){
        eventService.removeEventById(id);
    }

    //GetEventByDate
    @GetMapping(value = "/event/{date}")
    public List<Event> getEventsViaDate(@Nullable @RequestParam String date){

        return eventService.getEventsBasedOnDate(date);
    }


    //updateEventByEventLocation
    @PutMapping(value = "/Event/{id}/{locationOfEvent}")
    public String updateEventByEventLocation(@PathVariable Integer id , @PathVariable Event locationOfEvent){
        return eventService.updateEventByEventLocation(id,locationOfEvent);
    }

}
