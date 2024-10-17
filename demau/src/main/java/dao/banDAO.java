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
	private static final String INSERT = "INSERT INTO ban (Ma, Ten, SoThich, GioiTinh) VALUES (?, ?, ?, ?)";
	private static final String DELETE = "DELETE FROM ban WHERE Id = ?";

	public static List<Ban> getAll() {
		List<Ban> list = new ArrayList<Ban>();
		try (Connection con = Connect.getConnect()) {
			PreparedStatement stmt = con.prepareStatement(SELECT_ALL);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Ban entity = new Ban();
				entity.setId(rs.getInt("Id"));
				entity.setMa(rs.getString("Ma"));
				entity.setTen(rs.getString("Ten"));
				entity.setSoThich(rs.getString("SoThich"));
				entity.setGioiTinh(rs.getInt("GioiTinh"));
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
			stmt.setString(1, entity.getMa());
			stmt.setString(2, entity.getTen());
			stmt.setString(3, entity.getSoThich());
			stmt.setInt(4, entity.getGioiTinh());
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
