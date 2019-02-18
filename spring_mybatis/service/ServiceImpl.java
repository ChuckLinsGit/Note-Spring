package spring.spring_mybatis.service;

import java.util.List;
import java.util.Map;

import spring.spring_mybatis.DAO.IStudentDAO;
import spring.spring_mybatis.bean.Student;

public class ServiceImpl implements IService {
	
	private IStudentDAO dao;
	
	public IStudentDAO getDao() {
		return dao;
	}

	public void setDao(IStudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public void addStudent(Student stu) {
		dao.insertStudent(stu);
	}

	@Override
	public void deleteStudent(Map map) {
		dao.deleteStudent(map);
	}

	@Override
	public void changeStudent(Student stu) {
		dao.updateStudent(stu);
	}

	@Override
	public String fineStudentNames() {
		return dao.queryStudentNames();
	}

	@Override
	public List<Student> fineStudents() {
		return dao.queryStudents();
	}


}
