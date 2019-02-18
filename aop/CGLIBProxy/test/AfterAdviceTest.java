package spring.aop.CGLIBProxy.test;

import org.junit.Before;				
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.aop.CGLIBProxy.bean.testImpl;


public class AfterAdviceTest {

	ApplicationContext ac;
	
	@Before
	public void beforeTest(){
		String resouce = "src/spring/aop/CGLIBProxy/applicationContext.xml";
		ac=new FileSystemXmlApplicationContext(resouce);
	}
	
	/**
	 * 不继承接口实现CGLIB代理
	 *debug中testImpl变量值
	 * testImpl	testImplWithoutImplements$$EnhancerBySpringCGLIB$$9a9657db  (id=49)	
	public void test(){
 		testImplWithoutImplements testImpl=(testImplWithoutImplements) ac.getBean("testCGLIBProxy");
		testImpl.doSome();
		System.out.println(testImpl.forName());
	}
	 */
	
	/**
	 * 继承接口实现CGLIB代理
	 *debug中testImpl变量值
	 * testImpl	testImplWithoutImplements$$EnhancerBySpringCGLIB$$9a9657db  (id=49)	
	 */
	@Test
	public void test(){
		testImpl testImpl=(testImpl) ac.getBean("testCGLIBProxy");
		testImpl.doSome();
		System.out.println(testImpl.forName());
	}
}
