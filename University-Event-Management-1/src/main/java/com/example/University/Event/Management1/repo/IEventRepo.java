package com.example.University.Event.Management1.repo;

import com.example.University.Event.Management1.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEventRepo extends JpaRepository<Event,Integer> {
}
