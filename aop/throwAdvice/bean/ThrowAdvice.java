package spring.aop.throwAdvice.bean;

import org.springframework.aop.ThrowsAdvice;

public class ThrowAdvice implements ThrowsAdvice{
	public void afterThrowing(UserException ex){
		System.out.println("�����û��쳣: "+ex.getMessage());
	}
	public void afterThrowing(PasswordException ex){
		System.out.println("���������쳣: "+ex.getMessage());
	}
	public void afterThrowing(Exception ex){
		System.out.println("�����쳣: "+ex.getMessage());
	}
}
