package spring.spring_mybatis.service;

import java.util.List;
import java.util.Map;

import spring.spring_mybatis.bean.Student;

public interface IService {
	
	public void addStudent(Student stu);
	
	public void changeStudent(Student stu);
	
	public void deleteStudent(Map map);
	
	public String fineStudentNames();
	
	public List<Student> fineStudents();

}
