package spring.dependencyInjection.annotionDi.test;

import org.junit.Before;	
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.dependencyInjection.annotionDi.bean.testImpl;

public class setterDiTest {

	ApplicationContext ac;
	
	@Before
	public void beforeTest(){
		String resouce = "/src/spring/dependencyInjection/annotionDi/applicationContext.xml";
		ac=new FileSystemXmlApplicationContext(resouce);
	}
	
	@Test
	public void test(){
		testImpl testImpl=(testImpl)ac.getBean("testImpl");
		System.out.println(testImpl);
		System.out.println(testImpl.getSchool().getName());
	}

}
