package utils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Connect {

	private final static String URL = "jdbc:sqlserver://localhost:1433;" + "database=QLKH;" + "user=sa;"
			+ "password=123456;" + "encrypt=true;" + "trustServerCertificate=true;";
//            + "loginTimeout=30;";

	public static Connection getConnect() throws SQLException {
		return DriverManager.getConnection(URL);
	}

//	public static void main(String[] args) {
//		try {
//			Connection sConn = Connect.getConnect();
//			DatabaseMetaData data = (DatabaseMetaData) sConn.getMetaData();
//			// hien thi thong tin sql khi ket noi thanh cong
//			System.out.println("Driver Name: " + data.getDriverName());
//			System.out.println("Driver Version: " + data.getDriverVersion());
//			System.out.println("Product Name: " + data.getDatabaseProductName());
//			System.out.println("Version: " + data.getDatabaseProductVersion());
//		} catch (SQLException e) {
//			System.out.println("Lỗi kết nối: " + e);
//		}
//	}

}