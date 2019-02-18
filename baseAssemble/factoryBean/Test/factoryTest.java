package spring.baseAssemble.factoryBean.Test;

import org.junit.Test;	
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.baseAssemble.factoryBean.Impl.testImpl;



public class factoryTest {
	
	/**
	 * ͨ����̬factory-bean�ù���ģʽ�������󣺽���
	 */
	@Test
	public void testDynamicFactoryBean (){
		String resouce = "/src/spring/baseAssemble/factoryBean/applicationContext.xml";
		ApplicationContext ac=new FileSystemXmlApplicationContext(resouce);
		testImpl testImpl=(testImpl) ac.getBean("testDynamicBean");
		testImpl.doSome();
	}
	
	/**
	 * ͨ����̬factory-bean�ù���ģʽ�������󣺽���
	 */
	@Test
	public void testStaticFactoryBean (){
		String resouce = "/src/spring/baseAssemble/factoryBean/applicationContext.xml";
		ApplicationContext ac=new FileSystemXmlApplicationContext(resouce);
		testImpl testImpl=(testImpl) ac.getBean("testStaticBean");
		testImpl.doSome();
	}
	
	/*����̨����������������bean�������������������������Ľ��
	Static Factory Bean
	create object without arguments
	Dynamic Factory Bean
	create object without arguments
	doSome
	*/
}
