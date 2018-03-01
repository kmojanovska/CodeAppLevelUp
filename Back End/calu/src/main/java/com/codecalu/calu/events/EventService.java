package com.codecalu.calu.events;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepository;
	
	
	public List<Event> getAllEvents(){
		List<Event> events = new ArrayList<>();
		eventRepository.findAll()
		.forEach(events::add);
		return events;
	}
	
	public Event getEvent(int id) {
		return eventRepository.findOne(id);
	}
	
	public void addEvent(Event event) {
		eventRepository.save(event); 
	}
	
	public void updateEvent(Event event) {
		eventRepository.save(event);
	}
	
	public void deleteEvent(int id) {
		eventRepository.delete(id);
	}
}
