package dao;

import java.sql.*;
import java.util.*;
import entity.*;
import utils.Connect;

public class BanDAO {

	private final String SELEC_ALL = "SELECT * FROM Ban";
	private final String SELECT_BY_ID = "SELECT * FROM Ban WHERE id = ?";
	private final String INSERT = "INSERT INTO Ban (name, hobby, gender) VALUES (?, ?, ?)";
	private final String DELETE = "DELETE FROM Ban WHERE id = ?";

	public List<Ban> findAll() {
		List<Ban> list = new ArrayList<Ban>();
		try (Connection con = Connect.getConnect()) {
			PreparedStatement stmt = con.prepareStatement(SELEC_ALL);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Ban entity = new Ban();
				entity.setId(rs.getInt("id"));
				entity.setName(rs.getString("name"));
				entity.setHobby(rs.getString("hobby"));
				entity.setGender(rs.getBoolean("gender"));
				list.add(entity);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public Ban find() {
		Ban entity = new Ban();
		try (Connection con = Connect.getConnect()) {
			PreparedStatement stmt = con.prepareStatement(SELEC_ALL);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				entity.setId(rs.getInt("id"));
				entity.setName(rs.getString("name"));
				entity.setHobby(rs.getString("hobby"));
				entity.setGender(rs.getBoolean("gender"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return entity;
	}

}
