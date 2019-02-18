package spring.aop.pointCutAdvisor.nameMatch.test;

import org.junit.Before;		
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.aop.pointCutAdvisor.nameMatch.DAO.testDAO;


public class AfterAdviceTest {

	ApplicationContext ac;
	
	@Before
	public void beforeTest(){
		String resouce = "src/spring/aop/pointCutAdvisor/nameMatch/applicationContext.xml";
		ac=new FileSystemXmlApplicationContext(resouce);
	}

	@Test
	public void test(){
		testDAO testImpl=(testDAO)ac.getBean("testProxy");
		testImpl.doSome();
		testImpl.forName();
		testImpl.toString();
	}

}
