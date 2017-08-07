package com.aatek.biz;

import java.util.List;

import com.aatek.data.exception.DataServiceException;
import com.aatek.model.User;

public interface UserService {

	public List<User> getAllUsers() throws DataServiceException;
}
