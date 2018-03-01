package com.codecalu.calu.events;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.codecalu.calu.comments.Comment;
import com.codecalu.calu.login.User;
@Entity
@Table(name = "Event")
public class Event {

    @Id
    @Column(name = "event_id")
    @GeneratedValue
	private int event_id;
	

    @Column(name = "headline")
	private String headline;

    @Column(name = "explanation")
	private String explanation;
    
    @Column(name = "location")
	private String location;
    

    @Column(name = "date")
	private Date date;
    
    @ManyToMany(mappedBy = "events")
    private Set<User> users = new HashSet<User>();
	
    @OneToMany(mappedBy="event")
    private List<Comment> comments = new ArrayList<Comment>();
	
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
//	public List<User> getParticipants() {
//		return participants;
//	}
//	public void setParticipants(List<User> participants) {
//		this.participants = participants;
//	}
//	
//	

	
}
