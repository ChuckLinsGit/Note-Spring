package spring.spring_mybatis.bean;

public class Student {

	private Integer sid;
	private String  name;
	private Integer age;
	private Integer score;
	private Integer classid;
	
	public Student() {
		super();
	}

	public Student(Integer sid, String name, Integer age, Integer score,
			Integer classid) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.score = score;
		this.classid = classid;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getClassid() {
		return classid;
	}

	public void setClassid(Integer classid) {
		this.classid = classid;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age
				+ ", score=" + score + ", classid=" + classid + "]";
	}
	
	

}
