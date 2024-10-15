package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Ban;
import utils.Connect;

public class banDAO {

	private static final String SELECT_ALL = "SELECT * FROM ban";
	private static final String INSERT = "INSERT INTO ban (id, name, hobby, gender) VALUES (?, ?, ?, ?)";
	private static final String DELETE = "DELETE FROM ban WHERE id = ?";

	public static List<Ban> getAll() {
		List<Ban> list = new ArrayList<Ban>();
		try (Connection con = Connect.getConnect()) {
			PreparedStatement stmt = con.prepareStatement(SELECT_ALL);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Ban entity = new Ban();
				entity.setId(rs.getInt("Id"));
				entity.setName(rs.getString("name"));
				entity.setHobby(rs.getString("hobby"));
				entity.setGender(rs.getBoolean("gender"));
				list.add(entity);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return list;
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
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public static void remove(int id) {
		try (Connection con = Connect.getConnect()) {
			PreparedStatement stmt = con.prepareStatement(DELETE);
			stmt.setInt(1, id);
			stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
