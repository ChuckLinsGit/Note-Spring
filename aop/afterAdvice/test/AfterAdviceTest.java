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
	 * ����֪ͨ��returnValueֻ�ܵõ������ķ���ֵ���޷��ı䷽���ķ���ֵ
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
