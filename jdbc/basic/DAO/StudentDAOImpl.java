package spring.jdbc.basic.DAO;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import spring.jdbc.basic.bean.Student;
/**
 * this.getJdbcTemplate()是多例的，使用一次便立刻销毁
 * @author Chuck Lin
 *
 */
public class StudentDAOImpl extends JdbcDaoSupport implements IStudentDAO {

	@Override
	public void insertStudent(Student stu) {
		String sql="INSERT INTO STUDENT(NAME,AGE,SCORE,CLASSID) VALUE(?,?,?,?)";
		this.getJdbcTemplate().update(sql, stu.getName(),stu.getAge(),stu.getScore(),stu.getClassid());
	}

	@Override
	public void deleteStudent(Student stu) {
		String sql="DELETE FROM STUDENT WHERE CLASSID=?";
		this.getJdbcTemplate().update(sql, stu.getClassid());
	}

	@Override
	public void updateStudent(Student stu) {
		String sql="UPDATE STUDENT SET AGE=? WHERE CLASSID=? ";
		this.getJdbcTemplate().update(sql, stu.getAge(),stu.getClassid());
	}

	@Override
	public String queryStudentNameById(int id) {
		String sql = "SELECT NAME FROM STUDENT WHERE SID=?";
		return this.getJdbcTemplate().queryForObject(sql, String.class, id);
	}

	@Override
	public List<String> queryStudentNames() {
		String sql = "SELECT NAME FROM STUDENT";
		return this.getJdbcTemplate().queryForList(sql, String.class);
	}

	/**
	 *springJdbc查询结果不会自动封装对象
	 *需要使用rowMapper（行映射）接口的实现类 
	 */
	
	@Override
	public Student queryStudentById(int id) {
		String sql = "SELECT * FROM STUDENT WHERE SID=?";
		return this.getJdbcTemplate().queryForObject(sql, new StudentRowMapper(), id);
	}

	@Override
	public List<Student> queryStudents() {
		String sql = "SELECT *FROM STUDENT";
		return this.getJdbcTemplate().query(sql, new StudentRowMapper());
	}
	
}
