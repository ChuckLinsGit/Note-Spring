package spring.aop.methodInterceptor.bean;		

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 环绕通知调用invocation的process()方法并将结果返回时其他通知才能同时生效
 * 原因：因为不调用invocation的proceed方法并返回对象，其他通知将丢失对象或出错
 * @author Chuck Lin
 *
 */
public class MyMethodInterceptor implements MethodInterceptor{
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("MethodInterceptor");
		Object result=invocation.proceed();
		if(result!=null){
			result = ((String)result).toUpperCase();
		}
		return result;
	}
}
