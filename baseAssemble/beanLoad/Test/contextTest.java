package spring.baseAssemble.beanLoad.Test;

import org.junit.Test;	
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.baseAssemble.beanLoad.Impl.testImpl;



public class contextTest {
	
	/**
	 * 制定bean的声明周期
	 */
	@Test
	public void testContext (){
		String resouce = "/src/spring/baseAssemble/beanLoad/applicationContext.xml";
		ApplicationContext ac=new FileSystemXmlApplicationContext(resouce);
		testImpl testImpl=(testImpl) ac.getBean("testImpl");
		testImpl.doSome();
		((FileSystemXmlApplicationContext)ac).close();
	}
	

}
