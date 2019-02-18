package spring.baseAssemble.context.impl;

import spring.baseAssemble.context.DAO.testDAO;


public class testImpl implements testDAO{

	public testImpl() {
		System.out.println("create object without arguments");
	}

	@Override
	public void doSome() {
		System.out.println("doSome");
	}
	
	public String toString(){
		return "StringTest";
	}

	
}
