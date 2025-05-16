package com.example.event.controller;

import com.example.event.entity.Event;
import com.example.event.dto.EventDTO;
import com.example.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public void saveEvent(@RequestBody List<EventDTO> eventDTOs) {
        for (EventDTO eventDTO : eventDTOs) {
            eventService.saveEvent(eventDTO);
        }
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.findAll();
    }

    @GetMapping("/{from}")
    public List<Event> findByFrom(@PathVariable String from) {
        return eventService.findByFrom(from);
    }
} 