package com.example.University.Event.Management1.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {
    @Id
    private Integer eventId;
    private String eventName;
    private String eventLocation;
    private Date eventDate;
    private Time startTime;
    private Time endTime;


}
