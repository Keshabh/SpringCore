package com.springcore.jdbc.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springcore.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate; 
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query = "insert into Student(id,name,place) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getPlace());
		return r;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int update(Student student) {
		// TODO Auto-generated method stub
		String query = "update Student set name=?, place=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getPlace(),student.getId());
		return r;
	}
	public int delete(int sId) {
		// TODO Auto-generated method stub
		String query = "delete from Student where id=?";
		int r = this.jdbcTemplate.update(query,sId);
		return r;
	}
	
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		String query = "select * from Student";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> students = this.jdbcTemplate.query(query,rowMapper);
		return students;
	}
	public Student getStudent(int sId) {
		// TODO Auto-generated method stub
		String query = "select * from Student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query,rowMapper,sId);
		return student;
	}
	
	

}
