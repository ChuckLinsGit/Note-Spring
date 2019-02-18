package spring.aop.pointCutAdvisor.regexp.test;

import org.junit.Before;			
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.aop.pointCutAdvisor.regexp.DAO.testDAO;


public class AfterAdviceTest {

	ApplicationContext ac;
	
	@Before
	public void beforeTest(){
		String resouce = "src/spring/aop/pointCutAdvisor/regexp/applicationContext.xml";
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
