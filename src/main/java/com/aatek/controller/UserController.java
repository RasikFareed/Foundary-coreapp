package com.aatek.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aatek.biz.impl.UserServiceImpl;
import com.aatek.data.exception.DataServiceException;
import com.aatek.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

	private static Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	private UserServiceImpl user;

	@GetMapping
	public ResponseEntity<List<User>> getAllUsersController() {
		List<User> userList = null;
		ResponseEntity<List<User>> entity = new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
		try {
			userList = user.getAllUsers();
			entity = new ResponseEntity<>(userList, HttpStatus.OK);
		} catch (DataServiceException e) {
			e.printStackTrace();
		}
		return entity;

	}
}