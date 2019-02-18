package spring.aop.methodInterceptor.test;

import org.junit.Before;		
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.aop.methodInterceptor.DAO.testDAO;


public class methodInterceptorTest {

	ApplicationContext ac;
	
	@Before
	public void beforeTest(){
		String resouce = "src/spring/aop/methodInterceptor/applicationContext.xml";
		ac=new FileSystemXmlApplicationContext(resouce);
	}
	
	/**
	 * 环绕通知可以改变方法的返回值
	 */
	@Test
	public void test(){
		testDAO testImpl=(testDAO)ac.getBean("testProxy");
		testImpl.doSome();
		System.out.println(testImpl.forName());
	}
	
	/**
	 * create object without arguments
	   MethodInterceptor
	   doSome
	   MethodInterceptor
	   CHUCK LIN  
	 */
	
}
