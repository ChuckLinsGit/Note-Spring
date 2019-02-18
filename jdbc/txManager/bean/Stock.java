package spring.jdbc.txManager.bean;

public class Stock {

	private Integer sid;
	private String sname;
	private Integer count;
	
	public Stock() {
		super();
	}

	public Stock(Integer sid, String sname, Integer count) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.count = count;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Stock [sid=" + sid + ", sname=" + sname + ", count=" + count
				+ "]";
	}
	
	
}
