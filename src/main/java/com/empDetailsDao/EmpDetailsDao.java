package com.empDetailsDao;

import com.empDetails.EmpDetails;

public interface EmpDetailsDao {
	// inserting data
	public int insert(EmpDetails empDetails);

	// updating data
	public int update(EmpDetails empDetails);

	// update by name
	public int updateByName(EmpDetails empDetails);

	// delete data
	public int delete(int studentID);
	


}
