package spring.aop.throwAdvice.test;

import org.junit.Before;		
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.aop.throwAdvice.DAO.testDAO;
import spring.aop.throwAdvice.bean.PasswordException;
import spring.aop.throwAdvice.bean.UserException;

public class throwAdviceTest {

	ApplicationContext ac;
	
	@Before
	public void beforeTest(){
		String resouce = "src/spring/aop/throwAdvice/applicationContext.xml";
		ac=new FileSystemXmlApplicationContext(resouce);
	}	
	
	@Test
	public void test() throws PasswordException, UserException{
		testDAO testImpl=(testDAO)ac.getBean("testProxy");
		testImpl.throwException("GDOU", "0123456789");
//		testImpl.throwException("GDU", "0123456789");
//		testImpl.throwException("GDOU", "023456789");
	}
	
}
