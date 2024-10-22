package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.sach;
import utils.Connect;

public class sachDAO {

	private final String SELECT_ALL = "SELECT * FROM Sach";
	private final String INSERT = "INSERT INTO Sach (Ma, Ten, SoTrang, DonGia) VALUES (?,?,?,?)";
	private final String DELETE = "DELETE FROM Sach WHERE Id = ?";

	public List<sach> getAll() {
		List<sach> list = new ArrayList<sach>();
		try (Connection con = Connect.getConnect()) {
			PreparedStatement stmt = con.prepareStatement(SELECT_ALL);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				sach entity = new sach();
				entity.setId(rs.getInt("Id"));
				entity.setMa(rs.getString("Ma"));
				entity.setTen(rs.getString("Ten"));
				entity.setSoTrang(rs.getInt("SoTrang"));
				entity.setDonGia(rs.getFloat("DonGia"));
				list.add(entity);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return list;
	}

	public void add(sach entity) {
		try (Connection con = Connect.getConnect()) {
			PreparedStatement stmt = con.prepareStatement(INSERT);
			stmt.setString(1, entity.getMa());
			stmt.setString(2, entity.getTen());
			stmt.setInt(3, entity.getSoTrang());
			stmt.setFloat(4, entity.getDonGia());
			stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public void remove(int id) {
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
