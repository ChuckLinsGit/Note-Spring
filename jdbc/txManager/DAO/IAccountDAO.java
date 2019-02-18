package spring.jdbc.txManager.DAO;

import spring.jdbc.txManager.bean.Account;

public interface IAccountDAO {
	
	public void insertAccount(String aname, Integer money);

	public void buyStock(Account ac, int money, boolean isBuy);
}
