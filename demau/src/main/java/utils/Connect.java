package utils;

import java.sql.*;

public class Connect {

    private final static String URL
            = "jdbc:sqlserver://localhost:1433;"
            + "database=banbe;"
            + "user=sa;"
            + "password=123456;"
            + "encrypt=true;"
            + "trustServerCertificate=true;";
//            + "loginTimeout=30;";

    public static Connection getConnect() throws SQLException {
    	System.out.print(DriverManager.getConnection(URL));
        return DriverManager.getConnection(URL);
    }
    
    public static void main(String[] args) {
    	try {
    		Connection sConn = Connect.getConnect();
    		DatabaseMetaData data = (DatabaseMetaData) sConn.getMetaData();
            // hien thi thong tin sql khi ket noi thanh cong
            System.out.println("Driver Name: " + data.getDriverName());
            System.out.println("Driver Version: " + data.getDriverVersion());
            System.out.println("Product Name: " + data.getDatabaseProductName());
            System.out.println("Version: " + data.getDatabaseProductVersion());
    	} catch (SQLException e) {
    		System.out.println("Lỗi kết nối: " + e);
    	}
		
	}
    
    
    
}