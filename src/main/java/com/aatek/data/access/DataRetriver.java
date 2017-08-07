package com.aatek.data.access;

import java.util.List;

import com.aatek.data.access.exception.DataAccessException;
import com.aatek.dto.FullDayLeaveDTO;
import com.aatek.dto.HalfDayLeaveDTO;

public interface DataRetriver {
	/**
	 * Used to get the data by hql query.
	 * 
	 * @param query
	 *            query to execute
	 * @return the requested data
	 * @throws DataAccessException
	 *             if query format error
	 */
	public <E> List<E> retrieveListBySQL(String query) throws DataAccessException;

	public <E> Object retrieveOneBySQL(String query) throws DataAccessException;

	public <E> Integer add(String query) throws DataAccessException;

	public <E> Integer update(String query) throws DataAccessException;


}
