package spring.dependencyInjection.setterDi.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import spring.baseAssemble.context.DAO.testDAO;


public class CollectionImpl implements testDAO{
	
	private String[][] baseId;
	
	private School[] schools;
	
	private List<String> list;
	
	private Set<String> set;
	
	private Map<String,String> map;
	
	private Properties pro;

	public String[][] getBaseId() {
		return baseId;
	}

	public void setBaseId(String[][] baseId) {
		this.baseId = baseId;
	}

	public School[] getSchools() {
		return schools;
	}

	public void setSchools(School[] schools) {
		this.schools = schools;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Properties getPro() {
		return pro;
	}

	public void setPro(Properties pro) {
		this.pro = pro;
	}

	public CollectionImpl() {
		System.out.println("create object without arguments");
	}
	
	@Override
	public String toString() {
		return "CollectionImpl [baseId=" + Arrays.toString(baseId)
				+ ", schools=" + Arrays.toString(schools) + ", list=" + list
				+ ", set=" + set + ", map=" + map + ", pro=" + pro + "]";
	}

	@Override
	public void doSome() {
		System.out.println("doSome");
	}
}
