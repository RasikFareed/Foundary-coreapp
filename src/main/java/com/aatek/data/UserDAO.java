package com.aatek.data;

import java.util.List;

import com.aatek.data.exception.DataServiceException;
import com.aatek.model.User;

public interface UserDAO {
	
	public List<User> getAllUser() throws DataServiceException;

}
