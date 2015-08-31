package br.senai.sc.ti2014n1.pw4.wes.bi.dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;



public abstract class Dao {
	private Connection conn;
	
	public Connection getConnection(){
		if(conn == null){
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost/bi_db?"+
			"user=root&password=root");
				System.out.println("Conectou");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
}
