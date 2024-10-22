package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.SanPham;
import utils.Connect;

public class SanPhamDAO {

	static final String SELECT_ALL = "SELECT * FROM SanPham";
	static final String INSERT = "INSERT INTO SanPham (Ma, Ten, SoLuong, TrangThai) VALUES (?, ?, ?, ?)";
	static final String DELETE = "DELETE FROM SanPham WHERE Id = ?";

	public static List<SanPham> getAll() {
		List<SanPham> list = new ArrayList<SanPham>();
		try (Connection con = Connect.getConnect()) {
			PreparedStatement stmt = con.prepareStatement(SELECT_ALL);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				SanPham entity = new SanPham();
				entity.setId(rs.getInt("Id"));
				entity.setMa(rs.getString("Ma"));
				entity.setTen(rs.getString("Ten"));
				entity.setSoLuong(rs.getInt("SoLuong"));
				entity.setTrangThai(rs.getInt("TrangThai"));
				list.add(entity);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return list;
	}

	public static void add(SanPham entity) {
		try (Connection con = Connect.getConnect()) {
			PreparedStatement stmt = con.prepareStatement(INSERT);
			stmt.setString(1, entity.getMa());
			stmt.setString(2, entity.getTen());
			stmt.setInt(3, entity.getSoLuong());
			stmt.setInt(4, entity.getTrangThai());
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
