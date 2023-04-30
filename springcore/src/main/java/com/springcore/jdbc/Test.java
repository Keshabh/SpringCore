package com.springcore.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.jdbc.Dao.StudentDao;
import com.springcore.jdbc.entities.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/jdbc/JdbcConfig.xml");
		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		
//		//create an object of Student
//		Student stu = new Student();
//		stu.setId(202);
//		stu.setName("Varun");
//		stu.setPlace("Delhi");
//		
//		int result = studentDao.insert(stu);
//		System.out.println("student added "+result);
		
		//update
//		Student stu = new Student();
//		stu.setId(201);
//		stu.setName("Bipin");
//		stu.setPlace("UP");
//		
//		int result = studentDao.update(stu);
//		System.out.println("student updated "+result);
		
		//delete
//		int result = studentDao.delete(201);
//		System.out.println("student deleted "+ result);
		
		//getoneStudent
//		Student result = studentDao.getStudent(101);
//		System.out.println(result);
		
		//getAllData
		List<Student> students = studentDao.getAllStudent();
		System.out.println(students);

	}

}
