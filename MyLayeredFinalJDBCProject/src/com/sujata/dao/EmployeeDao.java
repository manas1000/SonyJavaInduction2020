package com.sujata.dao;

import java.sql.SQLException;
import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeDao {

	public Employee getRecord(int id)throws ClassNotFoundException,SQLException;
	public List<Employee> getAllRecords()throws ClassNotFoundException,SQLException;
	public int insertRecord(Employee employee)throws ClassNotFoundException,SQLException;
}
