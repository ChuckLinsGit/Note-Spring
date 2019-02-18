package spring.jdbc.txManager.service;	

import spring.jdbc.txManager.bean.Account;
import spring.jdbc.txManager.bean.Stock;


public interface IService {
	
	public void addAccount(Account ac);

	public void addStock(Stock st);
	
	public void buyStock(Account ac,Stock st,int money,boolean isBuy) throws BuyStockException;

}
