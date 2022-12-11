package com.cabbookingapp.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.cabbookingapp.dao.AdminDao;
import com.cabbookingapp.util.ConnectionUtil;

public class AdminDaoImpl implements AdminDao {
	public int Adminlogin(int adminId, String adminPassword) throws Exception {
		int adminId1 = 0;
		String adminPassword1 = null;

		Connection connection = ConnectionUtil.getConnection();
		Statement statement = connection.createStatement();
		String query = "SELECT *FROM ADMIN WHERE admin_id ='" + adminId + "' AND admin_password ='" + adminPassword
				+ "'";
		ResultSet rs = statement.executeQuery(query);
		while (rs.next()) {
			adminId1 = rs.getInt("admin_id");
			adminPassword1 = rs.getString("admin_password");
		}
		int result = 0;
		if (adminId1 == 0) {
			return 0;
		} else if (adminPassword1.equals(adminPassword)) {
			result = 1;
		} else {
			result = -1;
		}

		return result;
	}

}
