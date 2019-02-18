package spring.jdbc.basic.service;

import java.util.List;

import spring.jdbc.basic.bean.Student;

public interface IService {
	
	public void addStudent(Student stu);
	
	public void removeStudent(Student stu);
	
	public void changeStudent(Student stu);
	
	public String fineStudentNameById(int id);
	
	public List<String> fineStudentNames();
	
	public Student fineStudentById(int id);
	
	public List<Student> fineStudents();
}
