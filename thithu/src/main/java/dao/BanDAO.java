package dao;

import java.sql.*;
import java.util.*;
import entity.*;
import utils.Connect;

public class BanDAO {

	private static final String SELECT_ALL = "SELECT * FROM Ban";
	private static final String SELECT_BY_ID = "SELECT * FROM Ban WHERE id = ?";
	private static final String INSERT = "INSERT INTO Ban (id, name, hobby, gender) VALUES (?, ?, ?, ?)";
	private static final String DELETE = "DELETE FROM Ban WHERE id = ?";

	public static List<Ban> findAll() {
		List<Ban> list = new ArrayList<Ban>();
		try (Connection con = Connect.getConnect()) {
			PreparedStatement stmt = con.prepareStatement(SELECT_ALL);
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

	public static Ban find() {
		Ban entity = new Ban();
		try (Connection con = Connect.getConnect()) {
			PreparedStatement stmt = con.prepareStatement(SELECT_BY_ID);
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

	public static void add(Ban entity) {
		try (Connection con = Connect.getConnect()) {
			PreparedStatement stmt = con.prepareStatement(INSERT);
			stmt.setInt(1, entity.getId());
			stmt.setString(2, entity.getName());
			stmt.setString(3, entity.getHobby());
			stmt.setBoolean(4, entity.isGender());
			stmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void remove(int id) {
		try (Connection con = Connect.getConnect()) {
			PreparedStatement stmt = con.prepareStatement(DELETE);
			stmt.setInt(1, id);
			stmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
