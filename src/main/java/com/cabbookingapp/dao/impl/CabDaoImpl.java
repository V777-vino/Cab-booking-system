package com.cabbookingapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cabbookingapp.dao.CabDao;
import com.cabbookingapp.model.Cab;
import com.cabbookingapp.service.CabService;
import com.cabbookingapp.service.impl.CabServiceImpl;
import com.cabbookingapp.util.ConnectionUtil;

public class CabDaoImpl implements CabDao {

	public void insertCab(Cab cab) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("INSERT INTO cab(cab_name,seaters) VALUES (?,?);");
			statement.setString(1, cab.getCabName());
			statement.setInt(2, cab.getSeaters());
			if (statement.executeUpdate() == 1) {
				System.out.println("Cab details added");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public void deleteCab(int cabNumber) {

		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement("DELETE FROM cab WHERE cab_number = ?;");
			statement.setInt(1, cabNumber);
			if (statement.executeUpdate() == 1) {
				System.out.println("Cab detail deleted");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public List<Cab> findAllCab() {
		ArrayList<Cab> cab = new ArrayList<Cab>();
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement("SELECT*FROM cab;");
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Cab c = new Cab();

				c.setCabNumber(rs.getInt(1));
				c.setCabName(rs.getString(2));
				c.setSeaters(rs.getInt(3));

				cab.add(c);
				Cab.print(cab);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return cab;
	}

	public Cab findCab(int cabNumber) {
		Cab c = new Cab();
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement("select *from cab where cab_number = ?;");
			statement.setInt(1, cabNumber);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {

				c.setCabNumber(rs.getInt(1));
				c.setCabName(rs.getString(2));
				c.setSeaters(rs.getInt(3));

				CabService cs = new CabServiceImpl();
				cs.findCabValidate(c);
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return c;
	}

}
