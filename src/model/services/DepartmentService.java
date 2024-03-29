package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class DepartmentService {

	private DepartmentDAO departmentDAO = DaoFactory.createDepartmentDao();

	public List<Department> findAll() {
		return departmentDAO.findAll();
	}

	public void saveOrUpdate(Department obj) {
		if (obj.getId() == null) {
			departmentDAO.insert(obj);
		} else {
			departmentDAO.update(obj);
		}
	}

	public void remove(Department obj) {
		departmentDAO.deleById(obj.getId());
	}

}
