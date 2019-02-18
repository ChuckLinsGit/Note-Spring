package spring.dependencyInjection.constructorDi.bean;

import spring.dependencyInjection.constructorDi.DAO.testDAO;


public class testImpl implements testDAO{
	
	private String name;
	
	private int age;
	
	private School school;
	
	/**
	 * 实际上用不到无参构造器
	 */
	public testImpl() {
		System.out.println("create object without arguments");
	}
	
	public testImpl(String name, int age, School school) {
		super();
		System.out.println("create object with arguments");
		this.name = name;
		this.age = age;
		this.school = school;
	}

	public School getSchool(){
		return this.school;
	}
	
	@Override
	public String toString() {
		return "testImpl [name=" + name + ", age=" + age + ", school=" + school
				+ "]";
	}

	@Override
	public void doSome() {
		System.out.println("doSome");
	}
}
