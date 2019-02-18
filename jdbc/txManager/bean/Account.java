package spring.jdbc.txManager.bean;

public class Account {
	
	private Integer aid;
	private String aname;
	private Integer money;
	
	public Account() {
	}

	public Account(Integer aid, String aname, Integer money) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.money = money;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [aid=" + aid + ", aname=" + aname + ", money=" + money
				+ "]";
	}
	
	
}
