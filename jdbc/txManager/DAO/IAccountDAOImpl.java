package spring.jdbc.txManager.DAO;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import spring.jdbc.txManager.bean.Account;

public class IAccountDAOImpl extends JdbcDaoSupport implements IAccountDAO {

	@Override
	public void insertAccount(String aname, Integer money) {
		String sql = "INSERT INTO ACCOUNT (ANAME,MONEY) VALUE(?,?) ";
		this.getJdbcTemplate().update(sql, aname,money);
	}

	@Override
	public void buyStock(Account ac, int money, boolean isBuy) {
		String sql = "UPDATE ACCOUNT SET MONEY=MONEY+? WHERE ANAME=?";
		if(isBuy){
			sql="UPDATE ACCOUNT SET MONEY=MONEY-? WHERE ANAME=?";
		}
		this.getJdbcTemplate().update(sql, money,ac.getAname());
	}

}
