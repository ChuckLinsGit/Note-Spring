package spring.baseAssemble.context.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import spring.baseAssemble.context.DAO.testDAO;
import spring.baseAssemble.context.impl.testImpl;


public class contextTest {
	
	/**
	 * ApplicationContext容器:在bean未被调用前已创建对象
	 * 优点：响应快
	 * 缺点：消耗内存资源
	 */
	@Test
	public void testContext (){
		String resouce = "/src/spring/baseAssemble/context/applicationContext.xml";
		ApplicationContext ac=new FileSystemXmlApplicationContext(resouce);

		/*实现代理器：	
		 * testImpl testImpl=(testImpl) ac.getBean("testImpl");
		不能用接口的实现类（UserServiceImpl01_AOP）来转换Proxy的实现类，它们是同级，应该用共同的接口来转换。
		*/
		testDAO testImpl=(testDAO) ac.getBean("testImpl");
		System.out.println(testImpl.toString());//使用bean后处理器
	}
	
	
	
	
	
	/**
	 * BeanFactory容器：在bean未被调用时不创建对象
	 * 优点：减少内存消耗
	 * 缺点：响应慢
	 */
	@Test
	public void testBeanFactory(){
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		testImpl bean = (testImpl)beanFactory.getBean("testImpl");
		bean.doSome();
		
	}

	
}
