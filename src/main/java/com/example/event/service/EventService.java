package com.example.event.service;

import com.example.event.entity.Event;
import com.example.event.dto.EventDTO;
import java.util.List;

public interface EventService {
    void saveEvent(EventDTO eventDTO);
    List<Event> findByFrom(String from);
    List<Event> findAll();
} 