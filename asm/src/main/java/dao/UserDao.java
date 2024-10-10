package dao;

import entity.UserEntity;
import utils.Connect;
import java.util.List;

import org.apache.catalina.User;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

	private final String SELECT_ALL = "SELECT * FROM users";
	private final String SELECT_BY_ID = "SELECT * FROM users WHERE Id = ?";
	private final String INSERT = "INSERT INTO users (Type, Name, Email) VALUES (?, ?, ?)";
	private final String UPDATE = "UPDATE users SET Type = ?, Name = ?, Email = ? WHERE Id = ?";
	private final String DELETE = "DELETE FROM users WHERE id = ?";

	public List<UserEntity> getAll() {
		List<UserEntity> list = new ArrayList<UserEntity>();
		try {
			Connection con = Connect.getConnect();
			PreparedStatement stmt = con.prepareStatement(SELECT_ALL);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				UserEntity entity = new UserEntity();
				entity.setId(rs.getInt("Id"));
				entity.setName(rs.getString("Name"));
				entity.setEmail(rs.getString("Email"));
				entity.setType(rs.getInt("Type"));
				list.add(entity);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public UserEntity find(int id) {
		UserEntity entity = new UserEntity();
		try {
			Connection con = Connect.getConnect();
			PreparedStatement stmt = con.prepareStatement(SELECT_BY_ID);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				entity.setId(rs.getInt("Id"));
				entity.setName(rs.getString("Name"));
				entity.setEmail(rs.getString("Email"));
				entity.setType(rs.getInt("Type"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return entity;
	}

	public void add(UserEntity entity) {
		try {
			Connection con = Connect.getConnect();
			PreparedStatement stmt = con.prepareStatement(INSERT);
			stmt.setInt(1, entity.getType());
			stmt.setString(2, entity.getName());
			stmt.setString(3, entity.getEmail());
			stmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void update(UserEntity entity) {
		try {
			Connection con = Connect.getConnect();
			PreparedStatement stmt = con.prepareStatement(UPDATE);
			stmt.setInt(1, entity.getType());
			stmt.setString(2, entity.getName());
			stmt.setString(3, entity.getEmail());
			stmt.setInt(4, entity.getId());
			stmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void remove(int id) {
		try {
			Connection con = Connect.getConnect();
			PreparedStatement stmt = con.prepareStatement(DELETE);
			stmt.setInt(1, id);
			stmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
