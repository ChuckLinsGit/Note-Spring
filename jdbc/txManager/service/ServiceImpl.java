package spring.jdbc.txManager.service;		

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import spring.jdbc.txManager.DAO.IAccountDAO;
import spring.jdbc.txManager.DAO.IStockDAO;
import spring.jdbc.txManager.bean.Account;
import spring.jdbc.txManager.bean.Stock;

public class ServiceImpl implements IService {
	
	private IAccountDAO adao;
	private IStockDAO sdao;
	

	public void setAdao(IAccountDAO adao) {
		this.adao = adao;
	}

	public void setSdao(IStockDAO sdao) {
		this.sdao = sdao;
	}

	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
	@Override
	public void addAccount(Account ac) {
		adao.insertAccount(ac.getAname(),ac.getMoney());
	}

	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
	@Override
	public void addStock(Stock st) {
		sdao.insertStock(st.getSname(),st.getCount());
	}

	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,rollbackFor=BuyStockException.class)
	@Override
	public void buyStock(Account ac, Stock st, int money, boolean isBuy) throws BuyStockException {
		adao.buyStock(ac, money, isBuy); 
		if(1==1){
			throw new BuyStockException("交易出现问题");
		}
		sdao.buyStock(st, money/200, isBuy);
	}

}
