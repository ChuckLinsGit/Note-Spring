package spring.baseAssemble.context.processor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class testBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("before Initialization");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(final Object bean, String beanName)
			throws BeansException {
		System.out.println("after "+beanName+" Initialization");
		Object obj=Proxy.newProxyInstance(
				bean.getClass().getClassLoader(),
				bean.getClass().getInterfaces(), 
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] arg)
							throws Throwable {
						Object invoke=method.invoke(bean, arg);
						return ((String)invoke).toUpperCase();
					}
				});
		return obj;
	}
	
}
