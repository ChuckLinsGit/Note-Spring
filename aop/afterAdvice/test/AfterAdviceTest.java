package spring.aop.afterAdvice.test;

import org.junit.Before;		
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.aop.afterAdvice.DAO.testDAO;


public class AfterAdviceTest {

	ApplicationContext ac;
	
	@Before
	public void beforeTest(){
		String resouce = "src/spring/aop/afterAdvice/applicationContext.xml";
		ac=new FileSystemXmlApplicationContext(resouce);
	}
	
	/**
	 * 后置通知的returnValue只能得到方法的返回值但无法改变方法的返回值
	 */
	@Test
	public void test(){
		testDAO testImpl=(testDAO)ac.getBean("testProxy");
		testImpl.doSome();
		System.out.println(testImpl.forName());
	}
	
	/**
	 * create object without arguments
	  doSome
	  AfterReturningAdvice
  	  AfterReturningAdvice
	  returnVale : CHUCK LIN 
	  Chuck Lin 
	 */
	
}
