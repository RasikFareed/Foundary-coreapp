package com.aatek.data.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.aatek.data.UserDAO;
import com.aatek.data.access.DataRetriver;
import com.aatek.data.access.exception.DataAccessException;
import com.aatek.data.exception.DataServiceException;
import com.aatek.model.User;

@Repository
@Primary
public class UserDAOImpl implements UserDAO{
	private static Logger logger = Logger.getLogger(UserDAOImpl.class);
	
	@Autowired
	private DataRetriver dataRetriver;

	public DataRetriver getDataRetriver() {
		return dataRetriver;
	}

	public void setDataRetriver(DataRetriver dataRetriver) {
		this.dataRetriver = dataRetriver;
	}
	
	public List<User> getAllUser() throws DataServiceException{
		
		StringBuilder stringBuilder=new StringBuilder("SELECT customer_master.`customer_name`,COUNT(customer_name) AS no_of_items FROM customer_master\r\n" + 
				"JOIN order_master\r\n" + 
				"ON customer_master.`customer_uid`=order_master.`customer_uid`\r\n" + 
				"GROUP BY customer_master.`customer_name`");
		List<User> users = null;
		try {
			users = dataRetriver.retrieveListBySQL(stringBuilder.toString());
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		
	
		logger.info("Customer data retrieval success..");

		return users;
		
		
	}
}
