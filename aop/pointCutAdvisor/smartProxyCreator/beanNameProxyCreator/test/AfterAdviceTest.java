package spring.aop.pointCutAdvisor.smartProxyCreator.beanNameProxyCreator.test;

import org.junit.Before;				
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.aop.pointCutAdvisor.smartProxyCreator.beanNameProxyCreator.DAO.testDAO;


public class AfterAdviceTest {

	ApplicationContext ac;
	
	@Before
	public void beforeTest(){
		String resouce = "src/spring/aop/pointCutAdvisor/smartProxyCreator/beanNameProxyCreator/applicationContext.xml";
		ac=new FileSystemXmlApplicationContext(resouce);
	}

	@Test
	public void test(){
		
		testDAO testImpl=(testDAO)ac.getBean("testImpl");
		testImpl.doSome();
		testImpl.forName();
		testImpl.toString();

		testDAO testImpl2=(testDAO)ac.getBean("testImpl2");
		testImpl2.doSome();
		testImpl2.forName();
		testImpl2.toString();
	}

}
