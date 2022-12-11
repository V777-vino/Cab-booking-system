package com.cabbookingapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cabbookingapp.dao.ManagerDao;
import com.cabbookingapp.model.Cab;
import com.cabbookingapp.model.Manager;
import com.cabbookingapp.service.ManagerService;
import com.cabbookingapp.service.impl.ManagerServiceImpl;
import com.cabbookingapp.util.ConnectionUtil;

public class ManagerDaoImpl implements ManagerDao {

	public void insertManager(Manager manager) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"INSERT INTO manager(manager_name,manager_email,manager_password)\r\n" + "VALUES(?,?,?);");
			statement.setString(1, manager.getManagerName());
			statement.setString(2, manager.getManagerEmail());
			statement.setString(3, manager.getManagerPassword());
			if (statement.executeUpdate() == 1) {
				System.out.println("Manager details added");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public Manager findManager(int managerId) {
		Manager m = new Manager();
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM manager WHERE manager_id =?;");
			statement.setInt(1, managerId);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				m.setManagerId(rs.getInt(1));
				m.setManagerName(rs.getString(2));
				m.setManagerEmail(rs.getString(3));

				ManagerService ms = new ManagerServiceImpl();
				ms.findManagerValidate(m);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return m;
	}

	public void deleteManager(int managerId) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement("DELETE FROM manager WHERE manager_id = ?;" + "");
			statement.setInt(1, managerId);
			if (statement.executeUpdate() == 1) {
				System.out.println("Manager detail deleted");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public void updatePassword(String password, int managerId) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("UPDATE manager SET manager_password = ? WHERE manager_id =?;");
			statement.setString(1, password);
			statement.setInt(2, managerId);
			if (statement.executeUpdate() == 1) {
				System.out.println("Manager detail updated");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public List<Manager> findAllManager() {
		ArrayList<Manager> manager = new ArrayList<Manager>();
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement("SELECT*FROM manager;");
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Manager m = new Manager();
				m.setManagerId(rs.getInt(1));
				m.setManagerName(rs.getString(2));
				m.setManagerEmail(rs.getString(3));

				manager.add(m);
				Manager.print(manager);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return manager;

	}

	public int managerLogin(int managerId, String managerPassword) throws Exception {
		int managerId1 = 0;
		String managerPassword1 = null;

		Connection connection = ConnectionUtil.getConnection();
		Statement statement = connection.createStatement();
		String query = "SELECT *FROM MANAGER WHERE manager_id ='" + managerId + "' AND manager_password ='"
				+ managerPassword + "'";
		ResultSet rs = statement.executeQuery(query);
		while (rs.next()) {
			managerId1 = rs.getInt("manager_id");
			managerPassword1 = rs.getString("manager_password");
		}
		int result = 0;
		if (managerId == 0) {
			return 0;
		} else if (managerPassword1.equals(managerPassword)) {
			result = 1;
		} else {
			result = -1;
		}
		return result;
	}

}
