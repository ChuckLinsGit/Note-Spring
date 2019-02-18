package spring.aop.aspectJ.xml.bean;

import org.aspectj.lang.JoinPoint;		
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class aspectJXml{
	

	public void beforeAdvice(){
		System.out.print("aspectJ beforeAdvice-");
	}
	

	public void beforeAdvice(JoinPoint jp){
		System.out.println("jp: "+jp);
	}
	

	public void afterReturn(){
		System.out.println("aspectJ afterReturn");
	}	
	


	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		Object result=pjp.proceed();
		System.out.println("around");
		if(result!=null){
			return ((String)result).toUpperCase();
		}
		return result;
	}

	public void afterThrowing(){
		System.out.println("afterThrowing");
	}

	public void afterThrowing(Exception ex){
		System.out.println("afterThrowing ex: "+ex.getMessage());
	}
	
	public void after(){
		System.out.println("after");
	}
	


}
