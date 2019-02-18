package spring.dependencyInjection.annotionDi.bean;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import spring.dependencyInjection.annotionDi.DAO.testDAO;

@Component("testImpl")
public class testImpl implements testDAO{
	
	@Value("Chuck Lin")
	private String name;
	
	@Value("22")
	private int age;

/*
 	@Autowired		//spring�Դ�ע�⣬����byType��ʽע��
 	
 	
 	@Autowired
	@Qualifier(value="testSchool")//spring�Դ�ע�⣬����byName��ʽע��
*/
	
/*	
 	@Resource		//jsrע�⣬����byType��ʽע��
*/	
	@Resource(name="testSchool")		//jsrע�⣬����byType��ʽע��
	private School school;
	
	public int getAgeIfLess23(){
		return this.age >23 ? 23 :this.age;
	}

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
	public void doSome() {
		System.out.println("doSome");
	}
}
