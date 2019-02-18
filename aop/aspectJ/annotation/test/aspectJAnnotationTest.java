package spring.aop.aspectJ.annotation.test;

import org.junit.Before;				
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.aop.aspectJ.annotation.DAO.testDAO;


public class aspectJAnnotationTest {
	
	ApplicationContext ac;
	
	@Before
	public void beforeTest(){
		String resouce = "src/spring/aop/aspectJ/annotation/applicationContext.xml";
		ac=new FileSystemXmlApplicationContext(resouce);
	}
	
	@Test
	public void test(){
		testDAO testImpl=(testDAO)ac.getBean("testImpl");
		System.out.println("-------------------------------");
		testImpl.doSome();
		System.out.println("-------------------------------");
		System.out.println(testImpl.forName());
		System.out.println("-------------------------------");
		System.out.println(testImpl.toString());
		
	}
}
