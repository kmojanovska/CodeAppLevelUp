package com.codecalu.calu.comments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codecalu.calu.events.Event;
import com.codecalu.calu.events.EventService;


@RestController
@RequestMapping(value = "/api")
public class CommentController {

	@Autowired
	public CommentService commentService;
	
	@RequestMapping("/comments")
	public List<Comment> getAllComments(){
		return commentService.getAllComments();
	}
	
	@RequestMapping("/comments/{id}")
	public Comment getComment(@PathVariable int id){
		return commentService.getComment(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/comments")
	public void addComment(@RequestBody Comment comment){
		commentService.addComment(comment);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/comments")
	public void updateComment(@RequestBody Comment comment){
		commentService.updateComment(comment);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/comments/{id}")
	public void deleteComment(@PathVariable int id) {
		commentService.deleteComment(id);
	}
	
	
		
	
	
	
}
