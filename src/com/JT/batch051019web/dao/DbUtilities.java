package com.JT.batch051019web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtilities {
	
	public void getCustomerData() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe/test", "test", "test");
		Statement st = con.createStatement();
		st.execute("select * from customer where cid=12345");
		System.out.println("sdfghjk");
	}

	public void getCustomerData(String cid) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "test", "test");
		Statement st = con.createStatement();
		String query="select * from customer where cid='" + cid + "'";
		st.execute(query);
		System.out.println("method1");
	}

	public void getCustomerData(int pin) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe/test", "test", "test");
		Statement st = con.createStatement();
		st.execute("select * from customer where pin='" + pin + "'");
		System.out.println("method3");
	}

	public void getCustomerData(String name, int pin) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe/test", "test", "test");
		Statement st = con.createStatement();
		st.execute("select * from customer where name='" + name + "' and pin='" + pin + "'");
		System.out.println("method3");
	}
	
	public void getCustomerData(String query,boolean rslt) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe/test", "test", "test");
		Statement st = con.createStatement();
		st.execute(query);
		System.out.println("method3");
	}

}
