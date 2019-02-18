package spring.dependencyInjection.constructorDi.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.dependencyInjection.constructorDi.bean.testImpl;


public class constructrDiTest {

	ApplicationContext ac;
	
	@Before
	public void beforeTest(){
		String resouce = "/src/spring/dependencyInjection/constructorDi/applicationContext.xml";
		ac=new FileSystemXmlApplicationContext(resouce);
	}
	
	@Test
	public void test(){
		testImpl testImpl=(testImpl)ac.getBean("testImpl");
		System.out.println(testImpl);
		System.out.println(testImpl.getSchool().getName());
}
}
