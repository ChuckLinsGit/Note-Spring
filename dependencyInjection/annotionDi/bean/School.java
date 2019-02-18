package spring.dependencyInjection.annotionDi.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("testSchool")
public class School {
	@Value("GDOU")
	private String name;

	public School() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
