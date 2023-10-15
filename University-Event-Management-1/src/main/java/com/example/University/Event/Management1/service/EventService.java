package com.example.University.Event.Management1.service;

import com.example.University.Event.Management1.entity.Event;
import com.example.University.Event.Management1.repo.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    IEventRepo iEventRepo;

    public String addEvents(List<Event> newEvents) {
        iEventRepo.saveAll(newEvents);
        return "Events Added";
    }

    public String updateEvents(Integer id, String name) {
        Event event=iEventRepo.findById(id).orElseThrow(null);
        if( event != null){
            event.setEventName(name);
            iEventRepo.save(event);
            return "Events updated";
        }
        else{
            return "invalid id";
        }
    }

    public String removeEvents() {
        iEventRepo.deleteAll();
        return "events deleted";
    }

    public Optional<Event> getEventsById(Integer id) {
        return iEventRepo.findById(id);
    }

    public List<Event> getEvents() {
        return iEventRepo.findAll();
    }
}
