//package jpa.service;
//
//import java.sql.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class Service {
//	private String url = "dbc:mariadb://localhost:3306/smsdb";
//	private String username = "root";
//	private String password = "Dobley@8";
//
//	public ResultSet getResultSet(String query) throws ClassNotFoundException, SQLException {
//		Class.forName("org.mariadb.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url, username, password);
//		Statement st = con.createStatement();
//		return st.executeQuery(query);
//
//	}
//}
