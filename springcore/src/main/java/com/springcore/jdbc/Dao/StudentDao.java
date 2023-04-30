package com.springcore.jdbc.Dao;

import java.util.List;

import com.springcore.jdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int update(Student student);
	public int delete(int sId);
	public Student getStudent(int sId);
	public List<Student> getAllStudent();

}
