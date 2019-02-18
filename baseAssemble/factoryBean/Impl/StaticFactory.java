package spring.baseAssemble.factoryBean.Impl;

public class StaticFactory {
	public static testImpl getTestImpl(){
		System.out.println("Static Factory Bean");
			return new testImpl();
	}
}
