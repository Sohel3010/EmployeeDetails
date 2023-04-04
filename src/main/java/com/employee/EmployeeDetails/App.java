package com.employee.EmployeeDetails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.empDetails.EmpDetails;
import com.empDetailsDao.EmpDetailsDao;
import com.empDetailsDao.EmpDetailsDaoImpl;

public class App {
	public static void main(String[] args) throws IOException {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/employee/EmployeeDetails/empdetails.xml");
		EmpDetailsDao S1 = con.getBean("emp3", EmpDetailsDaoImpl.class);

		// inserted
		EmpDetails ED = new EmpDetails();
		
		// Update
		
		EmpDetails ED2=new EmpDetails();

//		int result = S1.delete(1001);
//		System.out.println("Deleted");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("PRESS 1 TO ADD EMPLOYEE DETAILS");
			System.out.println("PRESS 2 TO UPDATE EMPLOYEE DETAILS");
			System.out.println("PRESS 3 TO DELETE EMPLOYEE DETAILS");
			System.out.println("PRESS 4 TO SELECT SINGLE EMPLOYEE DETAILS");
			System.out.println("PRESS 5 TO SELECT ALL EMPLOYEE DETAILS");
			int num = Integer.parseInt(br.readLine());
			switch (num) {
			case 1:
				System.out.println("Enter employee Id :");
				int id = Integer.parseInt(br.readLine());

				System.out.println("Enter employee Name :");
				String name = br.readLine();

				System.out.println("Enter employee Gender :");
				String gender = br.readLine();

				System.out.println("Enter employee Email :");
				String email = br.readLine();

				System.out.println("Enter employee Password :");
				String pass = br.readLine();

				System.out.println("Enter employee Conatct :");
				String contact = br.readLine();

				System.out.println("Enter employee Job Role :");
				String role = br.readLine();

				System.out.println("Enter employee Salary :");
				int salary = Integer.parseInt(br.readLine());

				ED.setId(id);
				ED.setName(name);
				ED.setGender(gender);
				ED.setEmail(email);
				ED.setPassword(pass);
				ED.setContact(contact);
				ED.setJobRole(role);
				ED.setSalary(salary);

				int result = S1.insert(ED);
				System.out.println("Details Added " + result) ;
				break;
				
				
			case 2:
				System.out.println("Enter employee Id :");
				int id1 = Integer.parseInt(br.readLine());

				System.out.println("Enter employee Name :");
				String name1 = br.readLine();

				System.out.println("Enter employee Gender :");
				String gender1 = br.readLine();

				System.out.println("Enter employee Email :");
				String email1 = br.readLine();

				System.out.println("Enter employee Password :");
				String pass1 = br.readLine();

				System.out.println("Enter employee Conatct :");
				String contact1 = br.readLine();

				System.out.println("Enter employee Job Role :");
				String role1 = br.readLine();

				System.out.println("Enter employee Salary :");
				int salary1 = Integer.parseInt(br.readLine());

				ED2.setId(id1);
				ED2.setName(name1);
				ED2.setGender(gender1);
				ED2.setEmail(email1);
				ED2.setPassword(pass1);
				ED2.setContact(contact1);
				ED2.setJobRole(role1);
				ED2.setSalary(salary1);

				int result1 = S1.update(ED2);
				System.out.println("Updated " + result1);
				
				break;
			case 3:
				System.out.println("Enter employee Id : ");
				int id3=Integer.parseInt(br.readLine());
				int result3 = S1.delete(id3);
				System.out.println("Deleted " + result3);
				break;
			case 4:
				System.out.println("Good");
				break;
			case 5:
				System.out.println("Good");
				break;
			case 6:
				System.out.println("Good");
				break;

			default:
				System.out.println("Please check the number");
			}

		}
	}

}
