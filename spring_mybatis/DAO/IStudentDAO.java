package spring.spring_mybatis.DAO;

import java.util.List;
import java.util.Map;

import spring.spring_mybatis.bean.Student;

public interface IStudentDAO {
	
	public void insertStudent(Student stu);
	
	public void deleteStudent(Map map);
	
	public void updateStudent(Student stu);

	public String queryStudentNames();
	
	public List<Student> queryStudents();
}
