package spring.baseAssemble.factoryBean.Test;

import org.junit.Test;	
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.baseAssemble.factoryBean.Impl.testImpl;



public class factoryTest {
	
	/**
	 * 通过动态factory-bean用工厂模式创建对象：解耦
	 */
	@Test
	public void testDynamicFactoryBean (){
		String resouce = "/src/spring/baseAssemble/factoryBean/applicationContext.xml";
		ApplicationContext ac=new FileSystemXmlApplicationContext(resouce);
		testImpl testImpl=(testImpl) ac.getBean("testDynamicBean");
		testImpl.doSome();
	}
	
	/**
	 * 通过静态factory-bean用工厂模式创建对象：解耦
	 */
	@Test
	public void testStaticFactoryBean (){
		String resouce = "/src/spring/baseAssemble/factoryBean/applicationContext.xml";
		ApplicationContext ac=new FileSystemXmlApplicationContext(resouce);
		testImpl testImpl=(testImpl) ac.getBean("testStaticBean");
		testImpl.doSome();
	}
	
	/*控制台结果：如果两个工厂bean都存在则会出现两个都被解析的结果
	Static Factory Bean
	create object without arguments
	Dynamic Factory Bean
	create object without arguments
	doSome
	*/
}
