package com.example.event.service.impl;

import com.example.event.entity.Event;
import com.example.event.dto.EventDTO;
import com.example.event.mapper.EventMapper;
import com.example.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    
    @Autowired
    private EventMapper eventMapper;

    @Override
    public void saveEvent(EventDTO eventDTO) {
        Event event = new Event();
        event.setTransactionHash(eventDTO.getTransactionHash());
        event.setEventName(eventDTO.getEventName());
        event.setFrom(eventDTO.getArgs().getFrom());
        event.setTo(eventDTO.getArgs().getTo());
        event.setValue(eventDTO.getArgs().getValue());
        event.setAddress(eventDTO.getAddress());
        event.setTopics(String.join(",", eventDTO.getTopics()));
        event.setData(eventDTO.getData());
        event.setBlockHash(eventDTO.getBlockHash());
        event.setBlockNumber(eventDTO.getBlockNumber());
        event.setBlockTimestamp(eventDTO.getBlockTimestamp());
        event.setTransactionIndex(eventDTO.getTransactionIndex());
        event.setLogIndex(eventDTO.getLogIndex());
        event.setRemoved(eventDTO.getRemoved());
        
        eventMapper.saveOrUpdate(event);
    }

    @Override
    public List<Event> findByFrom(String from) {
        return eventMapper.findByFrom(from);
    }

    @Override
    public List<Event> findAll() {
        return eventMapper.selectList(null);
    }
} 