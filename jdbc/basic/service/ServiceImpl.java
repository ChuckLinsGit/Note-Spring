package spring.jdbc.basic.service;

import java.util.List;

import spring.jdbc.basic.DAO.IStudentDAO;
import spring.jdbc.basic.bean.Student;

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
	public void removeStudent(Student stu) {
		dao.deleteStudent(stu);
	}

	@Override
	public void changeStudent(Student stu) {
		dao.updateStudent(stu);
	}

	@Override
	public String fineStudentNameById(int id) {
		return dao.queryStudentNameById(id);
	}

	@Override
	public Student fineStudentById(int id) {
		return dao.queryStudentById(id);
	}

	@Override
	public List<String> fineStudentNames() {
		return dao.queryStudentNames();
	}

	@Override
	public List<Student> fineStudents() {
		return dao.queryStudents();
	}

}
