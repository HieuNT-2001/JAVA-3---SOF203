package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.XeMay;
import utils.Connect;

public class XeMayDAO {

	private static final String SELECT_ALL = "SELECT * FROM XeMay";
	private static final String INSERT = "INSERT INTO XeMay (Ma, Ten, SoLuong, Mota) VALUES (?,?,?,?)";
	private static final String DELETE = "DELETE FROM XeMay WHERE Id = ?";

	public static List<XeMay> getAll() {
		List<XeMay> list = new ArrayList<XeMay>();
		try (Connection con = Connect.getConnect()) {
			PreparedStatement stmt = con.prepareStatement(SELECT_ALL);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				XeMay entity = new XeMay();
				entity.setId(rs.getInt("Id"));
				entity.setMa(rs.getString("Ma"));
				entity.setTen(rs.getString("Ten"));
				entity.setSoLuong(rs.getInt("SoLuong"));
				entity.setMoTa(rs.getString("Mota"));
				list.add(entity);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return list;
	}

	public static void add(XeMay entity) {
		try (Connection con = Connect.getConnect()) {
			PreparedStatement stmt = con.prepareStatement(INSERT);
			stmt.setString(1, entity.getMa());
			stmt.setString(2, entity.getMa());
			stmt.setInt(3, entity.getSoLuong());
			stmt.setString(4, entity.getMoTa());
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
