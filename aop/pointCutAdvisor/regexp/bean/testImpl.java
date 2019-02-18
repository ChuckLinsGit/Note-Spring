package spring.aop.pointCutAdvisor.regexp.bean;

import spring.aop.pointCutAdvisor.regexp.DAO.testDAO;

public class testImpl implements testDAO{
	
	private String name;
	
	private int age;
	
	private School school;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public testImpl() {
		System.out.println("create object without arguments");
	}
	
	@Override
	public String toString() {
		return "testImpl [name=" + name + ", age=" + age + ", school=" + school
				+ "]";
	}
	
	@Override
	public String forName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void doSome() {
		System.out.println("doSome");
	}

}
