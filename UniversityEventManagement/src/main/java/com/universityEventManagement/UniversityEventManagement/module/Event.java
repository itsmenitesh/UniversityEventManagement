package com.universityEventManagement.UniversityEventManagement.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Event_table")
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Event_Id")
    private Integer eventId;
    private String eventName;
    private String locationOfEvent;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
}
