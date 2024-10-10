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

//    //PrepareStatement
//    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
//        Connection con = getConnect();
//        PreparedStatement stmt;
//        if (sql.trim().startsWith("{")) {
//            stmt = con.prepareCall(sql); // PROC
//        } else {
//            stmt = con.prepareStatement(sql); //SQL
//        }
//        for (int i = 0; i < args.length; i++) {
//            stmt.setObject(i + 1, args[i]);
//        }
//        return stmt;
//    }
//
//    //Truy vấn (Select) hoặc truy vấn SP
//    public static ResultSet query(String sql, Object... args) throws SQLException {
//        PreparedStatement stmt = getStmt(sql, args);
//        return stmt.executeQuery();
//    }
//
//    //Insert, Update, Delete
//    public static int update(String sql, Object... args) {
//        try (PreparedStatement stmt = getStmt(sql, args)) {
//            return stmt.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

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