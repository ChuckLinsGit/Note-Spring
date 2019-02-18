package spring.dependencyInjection.setterDi.bean;

import spring.dependencyInjection.setterDi.DAO.testDAO;

public class testImpl2 implements testDAO {

	private String name;

	private int workAge;

	private School school;
	
	public int getWorkAgeIfLess23(){
		return this.workAge >23 ? 23 :this.workAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWorkAge() {
		return workAge;
	}

	public void setWorkAge(int workAge) {
		this.workAge = workAge;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "testImpl2 [name=" + name + ", workAge=" + workAge + ", school="
				+ school + "]";
	}

	@Override
	public void doSome() {
		System.out.println("doSome");
	}
}
