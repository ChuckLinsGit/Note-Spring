package spring.dependencyInjection.namespaceDi.bean;

import spring.dependencyInjection.namespaceDi.DAO.testDAO;


public class cImpl implements testDAO{
	
	private String name;
	
	private int age;
	
	private School school;
	
	/**
	 * 实际上用不到无参构造器
	 */
	public cImpl() {
		System.out.println("create object without arguments");
	}
	
	public cImpl(String name, int age, School school) {
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
