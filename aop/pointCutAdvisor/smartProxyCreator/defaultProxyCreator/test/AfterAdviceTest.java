package spring.aop.pointCutAdvisor.smartProxyCreator.defaultProxyCreator.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.aop.pointCutAdvisor.smartProxyCreator.defaultProxyCreator.DAO.testDAO;


public class AfterAdviceTest {

	ApplicationContext ac;
	
	@Before
	public void beforeTest(){
		String resouce = "src/spring/aop/pointCutAdvisor/smartProxyCreator/defaultProxyCreator/applicationContext.xml";
		ac=new FileSystemXmlApplicationContext(resouce);
	}

	@Test
	public void test(){
		testDAO testImpl=(testDAO)ac.getBean("testImpl");
		testImpl.doSome();
		testImpl.forName();
		testImpl.toString();
	}

}
