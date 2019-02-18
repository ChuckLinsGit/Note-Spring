package spring.aop.methodInterceptor.bean;		

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * ����֪ͨ����invocation��process()���������������ʱ����֪ͨ����ͬʱ��Ч
 * ԭ����Ϊ������invocation��proceed���������ض�������֪ͨ����ʧ��������
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
