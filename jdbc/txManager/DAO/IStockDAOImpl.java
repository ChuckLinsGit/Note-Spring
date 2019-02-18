package spring.jdbc.txManager.DAO;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import spring.jdbc.txManager.bean.Stock;

public class IStockDAOImpl extends JdbcDaoSupport implements IStockDAO {

	@Override
	public void insertStock(String sname, Integer count) {
		String sql = "INSERT INTO STOCK (SNAME,COUNT) VALUE(?,?) ";
		this.getJdbcTemplate().update(sql, sname,count);
	}

	@Override
	public void buyStock(Stock st, int count, boolean isBuy) {
		String sql = "UPDATE STOCK SET COUNT=COUNT-? WHERE SNAME=?";
		if(isBuy){
			sql="UPDATE STOCK SET COUNT=COUNT+? WHERE SNAME=?";
		}
		this.getJdbcTemplate().update(sql, count,st.getSname());
	}

}
