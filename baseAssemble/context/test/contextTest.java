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
	 * ApplicationContext����:��beanδ������ǰ�Ѵ�������
	 * �ŵ㣺��Ӧ��
	 * ȱ�㣺�����ڴ���Դ
	 */
	@Test
	public void testContext (){
		String resouce = "/src/spring/baseAssemble/context/applicationContext.xml";
		ApplicationContext ac=new FileSystemXmlApplicationContext(resouce);

		/*ʵ�ִ�������	
		 * testImpl testImpl=(testImpl) ac.getBean("testImpl");
		�����ýӿڵ�ʵ���ࣨUserServiceImpl01_AOP����ת��Proxy��ʵ���࣬������ͬ����Ӧ���ù�ͬ�Ľӿ���ת����
		*/
		testDAO testImpl=(testDAO) ac.getBean("testImpl");
		System.out.println(testImpl.toString());//ʹ��bean������
	}
	
	
	
	
	
	/**
	 * BeanFactory��������beanδ������ʱ����������
	 * �ŵ㣺�����ڴ�����
	 * ȱ�㣺��Ӧ��
	 */
	@Test
	public void testBeanFactory(){
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		testImpl bean = (testImpl)beanFactory.getBean("testImpl");
		bean.doSome();
		
	}

	
}
