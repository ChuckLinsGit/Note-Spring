package spring.jdbc.basic.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import spring.jdbc.basic.bean.Student;

/**
 * ��ѯ�����ӳ��
 * ��������ѯ����з�װ������
 * @author Chuck Lin
 *
 */
public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setAge(rs.getInt("age"));
		student.setName(rs.getString("name"));
		student.setScore(rs.getInt("score"));
		student.setSid(rs.getInt("sid"));
		student.setClassid(rs.getInt("classid"));
		return student;
	}

}
