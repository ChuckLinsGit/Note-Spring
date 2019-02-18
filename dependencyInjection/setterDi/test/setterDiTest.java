package spring.dependencyInjection.setterDi.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.dependencyInjection.setterDi.bean.CollectionImpl;
import spring.dependencyInjection.setterDi.bean.testImpl;
import spring.dependencyInjection.setterDi.bean.testImpl2;

public class setterDiTest {

	ApplicationContext ac;
	
	@Before
	public void beforeTest(){
		String resouce = "/src/spring/dependencyInjection/setterDi/applicationContext.xml";
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
		testImpl testImpl=(testImpl)ac.getBean("testImpl");
		System.out.println(testImpl);
		System.out.println(testImpl.getSchool().getName());
	}
	
	@Test
	public void testCollectionImpl(){
		CollectionImpl testImpl=(CollectionImpl)ac.getBean("testImpl");
		System.out.println(testImpl);
	}
	
	@Test
	public void testSpel(){
		testImpl testImpl1=(testImpl)ac.getBean("testImpl1");
		System.out.println(testImpl1);
		testImpl testImpl2=(testImpl)ac.getBean("testImpl2");
		System.out.println(testImpl2);
		testImpl testImpl=(testImpl)ac.getBean("testImpl");
		System.out.println(testImpl);
	}
	
	@Test
	public void testAbstractParent(){
		testImpl2 testImpl1=(testImpl2)ac.getBean("testImpl1");
		System.out.println(testImpl1);
		testImpl testImpl2=(testImpl)ac.getBean("testImpl2");
		System.out.println(testImpl2);
		testImpl testImpl=(testImpl)ac.getBean("testImpl");
		System.out.println(testImpl);
	}
	
	
}
