package spring.aop.throwAdvice.DAO;

import spring.aop.throwAdvice.bean.PasswordException;
import spring.aop.throwAdvice.bean.UserException;

public interface testDAO {
	public boolean throwException(String user,String password) throws UserException, PasswordException;
	public String toString();
}
