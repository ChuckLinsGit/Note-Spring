package spring.aop.throwAdvice.bean;

import spring.aop.throwAdvice.DAO.testDAO;


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
	public boolean throwException(String user,String password) throws UserException,PasswordException{
		if(!"GDOU".equals(user)){
			throw new UserException("�û�������ȷ");//�׳��쳣�����践��ֵ
		}
		if(!"0123456789".equals(password)){
			throw new PasswordException("���벻��ȷ");
		}
		double a=6/0;
		return true;
	}
}
