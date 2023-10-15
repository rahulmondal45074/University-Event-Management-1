package com.example.University.Event.Management1.conroller;

import com.example.University.Event.Management1.entity.Event;
import com.example.University.Event.Management1.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("events")
    public String addEvents(@RequestBody List<Event> newEvents){
        return eventService.addEvents(newEvents);
    }
    @PutMapping("event/id/{id}/name/{name}")
    public String updateEvents(@PathVariable Integer id,@PathVariable String name){
        return eventService.updateEvents(id,name);
    }
    @DeleteMapping("events")
    public String removeEvents(){
        return eventService.removeEvents();
    }
    @GetMapping("events/id/{id}")
    public Optional<Event> getEventsById(@PathVariable Integer id){
        return eventService.getEventsById(id);
    }

    @GetMapping("events")
    public List<Event> getEvents(){
        return eventService.getEvents();
    }



}
