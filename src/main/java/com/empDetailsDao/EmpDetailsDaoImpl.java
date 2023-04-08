package com.empDetailsDao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.empDetails.EmpDetails;

public class EmpDetailsDaoImpl implements EmpDetailsDao {
	private JdbcTemplate jdbcTemplate;

	public int insert(EmpDetails empDetails) {

		// inserting data
		String query = "insert into emp_details(ID,NAME,GENDER,EMAIL,PASSWORD,CONTACT,JOBROLE,SALARY) values (?,?,?,?,?,?,?,?)";
		int result = jdbcTemplate.update(query, empDetails.getId(), empDetails.getName(), empDetails.getGender(),
				empDetails.getEmail(), empDetails.getPassword(), empDetails.getContact(), empDetails.getJobRole(),
				empDetails.getSalary());
		return result;
	}

	// updating data
	public int update(EmpDetails empDetails) {
		String query = "update emp_details set NAME=?,GENDER=?,EMAIL=?,PASSWORD=?,CONTACT=?,JOBROLE=? ,SALARY=? WHERE ID=?";
		int result = jdbcTemplate.update(query, empDetails.getName(), empDetails.getGender(), empDetails.getEmail(),
				empDetails.getPassword(), empDetails.getContact(), empDetails.getJobRole(), empDetails.getSalary(),
				empDetails.getId());
		return result;
	}

	// update data by name
	@Override
	public int updateByName(EmpDetails empDetails) {
		String query = "update emp_details set ID=?,GENDER=?,EMAIL=?,PASSWORD=?,CONTACT=?,JOBROLE=?,SALARY=? WHERE NAME=?";
		int result = jdbcTemplate.update(query, empDetails.getId(), empDetails.getGender(), empDetails.getEmail(),
				empDetails.getPassword(), empDetails.getContact(), empDetails.getJobRole(), empDetails.getSalary(),
				empDetails.getName());
		return result;
	}

	// delete data
	public int delete(int studentID) {
		String query = "delete from emp_details where id = ?";
		int result = jdbcTemplate.update(query, studentID);
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
