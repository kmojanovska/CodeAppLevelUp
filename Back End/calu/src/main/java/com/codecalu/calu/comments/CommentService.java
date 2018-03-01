package com.codecalu.calu.comments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codecalu.calu.comments.Comment;
import com.codecalu.calu.comments.CommentRepository;
import com.codecalu.calu.login.User;

@Service
public class CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	
	public List<Comment> getAllComments(){
		List<Comment> Comments = new ArrayList<>();
		commentRepository.findAll()
		.forEach(Comments::add);
		return Comments;
	}
	
	public Comment getComment(int id) {
		return commentRepository.findOne(id);
	}
	
	public void addComment(Comment Comment) {
		commentRepository.save(Comment); 
	}
	
	public void updateComment(Comment Comment) {
		commentRepository.save(Comment);
	}
	
	public void deleteComment(int id) {
		commentRepository.delete(id);
	}
}