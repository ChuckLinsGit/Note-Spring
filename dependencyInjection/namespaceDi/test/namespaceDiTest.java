package spring.dependencyInjection.namespaceDi.test;

import org.junit.Before;	
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.dependencyInjection.namespaceDi.bean.cImpl;
import spring.dependencyInjection.namespaceDi.bean.pImpl;


public class namespaceDiTest {

	ApplicationContext cac;
	ApplicationContext pac;
	
	@Before
	public void beforeTest(){
		String cResouce = "/src/spring/dependencyInjection/namespaceDi/cnamespaceApplicationContext.xml";
		cac=new FileSystemXmlApplicationContext(cResouce);
		String pResouce = "/src/spring/dependencyInjection/namespaceDi/pnamespaceApplicationContext.xml";
		pac=new FileSystemXmlApplicationContext(pResouce);
	}
	
	@Test
	public void test(){
		pImpl testpImpl=(pImpl)pac.getBean("testImpl");
		System.out.println(testpImpl);
		System.out.println(testpImpl.getSchool().getName());
		
		cImpl testcImpl=(cImpl)cac.getBean("testImpl");
		System.out.println(testcImpl);
		System.out.println(testcImpl.getSchool().getName());
}
}
