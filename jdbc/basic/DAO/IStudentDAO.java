package spring.jdbc.basic.DAO;

import java.util.List;

import spring.jdbc.basic.bean.Student;

public interface IStudentDAO {
	
	public void insertStudent(Student stu);
	
	public void deleteStudent(Student stu);
	
	public void updateStudent(Student stu);
	
	public String queryStudentNameById(int id);

	public List<String> queryStudentNames();
	
	public Student queryStudentById(int id);
	
	public List<Student> queryStudents();
}
