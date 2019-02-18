package spring.jdbc.basic.test;

import java.util.List;

import org.junit.Before;	
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.jdbc.basic.bean.Student;
import spring.jdbc.basic.service.IService;

public class StudentTest {
	
	private IService serviceImpl;
	
	@Before
	public void beforeTest(){
		String resource = "src/spring/jdbc/basic/applicationContext.xml";
		ApplicationContext ac=new FileSystemXmlApplicationContext(resource);
		
		serviceImpl = (IService)ac.getBean("StudentServiceImpl");
	}
	
	
	@Test
	public void testSpringJdbcAdd(){
		Student stu1=new Student();
		stu1.setName("Chuck Lin");
		stu1.setAge(23);
		stu1.setScore(100);
		stu1.setClassid(1);
		serviceImpl.addStudent(stu1);
	}
	@Test
	public void testSpringJdbcRemove(){
		Student stu1=new Student();
		stu1.setName("Chuck Lin");
		stu1.setAge(23);
		stu1.setScore(100);
		stu1.setClassid(1);
		serviceImpl.removeStudent(stu1);
	}
	@Test
	public void testSpringJdbcChange(){
		Student stu1=new Student();
		stu1.setName("Chuck Lin");
		stu1.setAge(2);
		stu1.setScore(100);
		stu1.setClassid(1);
		serviceImpl.changeStudent(stu1);
	}
	
	@Test
	public void testSpringJdbcFindValue(){
		String name = serviceImpl.fineStudentNameById(8);
		System.out.println(name);
	}
	
	@Test
	public void testSpringJdbcFindValueList(){
		List<String> studentNames = serviceImpl.fineStudentNames();
		for(String name:studentNames){
			System.out.println(name);
		}
		
	}
	
	@Test
	public void testSpringJdbcFindObject(){
		Student student = serviceImpl.fineStudentById(8);
		System.out.println(student);
	}
	
	@Test
	public void testSpringJdbcFindList(){
		List<Student> students = serviceImpl.fineStudents();
		for(Student student:students){
			System.out.println(student);
		}
	}

	
}
