package spring.baseAssemble.beanLoad.Impl;

import org.springframework.context.annotation.Bean;

import spring.baseAssemble.beanLoad.DAO.testDAO;



public class testImpl implements testDAO{

	public testImpl() {
		System.out.println("create object without arguments");
	}
	
	public static Bean stepUp(){
		System.out.println("step up");
		return null;
	}

	@Override
	public void doSome() {
		System.out.println("doSome");
	}
	
	public static Bean tearDown(){
		System.out.println("tear down");
		return null;
	}
	
}
