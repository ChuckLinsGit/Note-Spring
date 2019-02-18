package spring.aop.aspectJ.annotation.bean;

import org.aspectj.lang.JoinPoint;	
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class aspectJAnnotation{
	
//	@Before("execution(* *..testDAO.*(..))")
	@Before("doPointCut()")
	public void beforeAdvice(){
		System.out.print("aspectJ beforeAdvice-");
	}
	
//	@Before("execution(* *..testDAO.*(..))")
	@Before("doPointCut()")
	public void beforeAdvice(JoinPoint jp){
		System.out.println("jp: "+jp);
	}
	
//	@AfterReturning("execution(* *..testDAO.*(..))")
	@AfterReturning("doPointCut()")
	public void afterReturn(){
		System.out.println("aspectJ afterReturn");
	}	
	
	/**
	 * ����֪ͨ����ProceedJoinPoint��process()���������������ʱ����֪ͨ����ͬʱ��Ч
	 * @param pjp
	 * @return
	 * @throws Throwable
	 */
//	@Around("execution(* *..testDAO.*(..))")
	@Around("doPointCut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		Object result=pjp.proceed();
		System.out.println("around");
		if(result!=null){
			return ((String)result).toUpperCase();
		}
		return result;
	}
	
//	@AfterThrowing(value="execution(* *..testDAO.*(..))")
	@AfterThrowing("doPointCut()")
	public void afterThrowing(){
		System.out.println("afterThrowing");
	}

	
//	@AfterThrowing(value="execution(* *..testDAO.*(..))",throwing="ex")
	@AfterThrowing(value="doPointCut()",throwing="ex")
	public void afterThrowing(Exception ex){
		System.out.println("afterThrowing ex: "+ex.getMessage());
	}
	
//	@After("execution(* *..testDAO.*(..))")
	@After("doPointCut()")
	public void after(){
		System.out.println("after");
	}
	
	//���ʣ����ʵ�ֺ�����throwing�Ȳ����Ķ�������
	@Pointcut("execution(* *..testDAO.*(..))")
	public void doPointCut(){}

}
