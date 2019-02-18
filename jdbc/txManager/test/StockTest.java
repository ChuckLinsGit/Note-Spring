package spring.jdbc.txManager.test;
	

import org.junit.Before;	
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.jdbc.txManager.bean.Account;
import spring.jdbc.txManager.bean.Stock;
import spring.jdbc.txManager.service.BuyStockException;
import spring.jdbc.txManager.service.IService;

public class StockTest {
	
	private IService serviceImpl;
	private Account acc;
	private Stock st;
	
	@Before
	public void beforeTest(){
		String resource = "src/spring/jdbc/txManager/applicationContext.xml";
		ApplicationContext ac=new FileSystemXmlApplicationContext(resource);
		
		serviceImpl = (IService)ac.getBean("ServiceImpl");
		
		acc = new Account();
		acc.setAname("Chuck Lin");
		acc.setMoney(1000000);
		st = new Stock();
		st.setCount(2000);
		st.setSname("π… –");
	}
	
	@Test
	public void newAccount(){
		serviceImpl.addAccount(acc);
		serviceImpl.addStock(st);
	}
	
	@Test
	public void buyStock(){
		try {
			serviceImpl.buyStock(acc, st, 100000, true);
		} catch (BuyStockException e) {
			e.printStackTrace();
		}
	}
}
