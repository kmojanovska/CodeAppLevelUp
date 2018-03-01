package com.codecalu.calu.login;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping(value = "/apiusers", method = RequestMethod.GET)
	public List<String> retrieveAllTodos() {
		List<String> users = new ArrayList<>();
		users.add("prvo");
		users.add("vtoro");
		return users;
	}
}
