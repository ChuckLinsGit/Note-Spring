package spring.spring_mybatis.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;	
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.spring_mybatis.bean.Student;
import spring.spring_mybatis.service.IService;

public class StudentTest {
	
	private IService serviceImpl;
	
	@Before
	public void beforeTest(){
		String resource = "src/spring/spring_mybatis/applicationContext.xml";
		ApplicationContext ac=new FileSystemXmlApplicationContext(resource);
		
		serviceImpl = (IService)ac.getBean("StudentServiceImpl");
	}
	
	
	@Test
	public void testSpringJdbcAdd(){
		Student stu1=new Student();
		stu1.setName("Chuck Lin");
		stu1.setAge(22);
		stu1.setScore(100);
		stu1.setClassid(1);
		serviceImpl.addStudent(stu1);
	}
	@Test
	public void testSpringJdbcRemove(){
		Student stu1=new Student();
		stu1.setName("Chuck Lin");
		stu1.setAge(22);
		stu1.setScore(100);
		stu1.setClassid(1);
		
		Map<String, String> delete=new HashMap<String,String>();
		delete.put("name",stu1.getName());
		
		serviceImpl.deleteStudent(delete);
	}
	@Test
	public void testSpringJdbcChange(){
		Student stu1=new Student();
		stu1.setName("Chuck Lin");
		stu1.setAge(22);
		stu1.setScore(100);
		stu1.setClassid(1);
		stu1.setSid(1);
		serviceImpl.changeStudent(stu1);
	}

	
	@Test
	public void testSpringJdbcFindList(){
		List<Student> students = serviceImpl.fineStudents();
		for(Student student:students){
			System.out.println(student);
		}
	}

	
}
