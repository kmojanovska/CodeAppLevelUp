package com.codecalu.calu.events;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class EventController {
	
	@Autowired
	public EventService eventService;
	
	@RequestMapping("/events")
	public List<Event> getAllEvents(){
		return eventService.getAllEvents();
	}
	
	@RequestMapping("/events/{id}")
	public Event getEvent(@PathVariable int id){
		return eventService.getEvent(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/events")
	public void addEvent(@RequestBody Event event){
		eventService.addEvent(event);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/events")
	public void updateEvent(@RequestBody Event event){
		eventService.updateEvent(event);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/events/{id}")
	public void deleteEvent(@PathVariable int id) {
		eventService.deleteEvent(id);
	}
	
	
	
	
}
