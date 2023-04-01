package com.empDetails;

public class EmpDetails {
	private int id;
	private String name;
	private String gender;
	private String email;
	private String password;
	private String contact;
	private String jobRole;
	private int salary;

	public EmpDetails() {

	}

	public EmpDetails(int id, String name, String gender, String email, String password, String contact, String jobRole,
			int salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.contact = contact;
		this.jobRole = jobRole;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmpDetails [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", password="
				+ password + ", contact=" + contact + ", jobRole=" + jobRole + ", salary=" + salary + "]";
	}

}
