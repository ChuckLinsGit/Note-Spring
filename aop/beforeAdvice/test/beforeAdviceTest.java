package spring.aop.beforeAdvice.test;

import org.junit.Before;	
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.aop.beforeAdvice.DAO.testDAO;

public class beforeAdviceTest {

	ApplicationContext ac;
	
	@Before
	public void beforeTest(){
		String resouce = "src/spring/aop/beforeAdvice/applicationContext.xml";
		ac=new FileSystemXmlApplicationContext(resouce);
	}
	
	/*		
	@Before
	public void beforeTestForXMLGroup(){
 		String resouce1 = "/src/spring/dependencyInjection/setterDi/spring-base.xml";
		String resouce2 = "/src/spring/dependencyInjection/setterDi/spring-beans.xml";
		ac=new FileSystemXmlApplicationContext(resouce1,resouce2);
		
		
		String resouce1 = "/src/spring/dependencyInjection/setterDi/spring-base.xml";
		String resouce2 = "/src/spring/dependencyInjection/setterDi/spring-beans.xml";
		String[] resources={resouce1,resouce2};
		ac=new FileSystemXmlApplicationContext(resources);
		
		String resouce = "/src/spring/dependencyInjection/setterDi/spring-*.xml";
		ac=new FileSystemXmlApplicationContext(resouce);
	}
	 */	
	
	@Test
	public void test(){
		testDAO testImpl=(testDAO)ac.getBean("testProxy");
		testImpl.doSome();
	}
	
}
