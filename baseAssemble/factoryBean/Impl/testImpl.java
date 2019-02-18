package spring.baseAssemble.factoryBean.Impl;

import org.springframework.context.annotation.Bean	;

import spring.baseAssemble.factoryBean.DAO.testDAO;





public class testImpl implements testDAO{

	public testImpl() {
		System.out.println("create object without arguments");
	}
	@Override
	public void doSome() {
		System.out.println("doSome");
	}

}
