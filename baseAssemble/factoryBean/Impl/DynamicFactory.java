package spring.baseAssemble.factoryBean.Impl;

public class DynamicFactory {
	public testImpl getTestImpl(){
		System.out.println("Dynamic Factory Bean");
			return new testImpl();
	}
}
