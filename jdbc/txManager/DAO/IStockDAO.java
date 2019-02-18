package spring.jdbc.txManager.DAO;

import spring.jdbc.txManager.bean.Stock;

public interface IStockDAO {

	public void insertStock(String sname, Integer count);

	public void buyStock(Stock st, int money, boolean isBuy);
	
}
