package com.aatek.biz.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aatek.biz.UserService;
import com.aatek.data.exception.DataServiceException;
import com.aatek.data.impl.UserDAOImpl;
import com.aatek.model.User;

@Service
public class UserServiceImpl implements UserService {
	private static Logger logger = Logger.getLogger(UserServiceImpl.class);

	@Autowired
	private UserDAOImpl userDAO;

	public List<User> getAllUsers() throws DataServiceException {
		List<User> list = null;
		list = userDAO.getAllUser();
		logger.info("retrived successfully");
		return list;
	}
}
