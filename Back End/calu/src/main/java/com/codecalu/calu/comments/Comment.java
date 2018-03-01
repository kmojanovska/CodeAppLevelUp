package com.codecalu.calu.comments;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.codecalu.calu.events.Event;
import com.codecalu.calu.login.User;
@Entity
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int comment_id;
	
	@ManyToOne
	private Event event;
	@ManyToOne
	private User user;
	private String comment;
	private Date date;
	
	
	public Comment() {
		
	}
	
	public Comment(Event event, User user, String comment, int comment_id) {
		super();
		this.event = event;
		this.user = user;
		this.comment = comment;
		this.comment_id = comment_id;
	}
	
	
	public int getComment_id() {
		return comment_id;
	}

	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Comment [event=" + event + ", user=" + user + ", comment=" + comment + "]";
	}
	
	
	
	
	
}
