package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PostgreSQLConnectionTest {
	private String URL = "jdbc:postgresql://localhost:5432/postgres";
	private String USERNAME = "postgres";
	private String PASSWORD = "postgres";
	
	@Test
	public void ConnectionTest() throws Exception{
		Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		log.info(con.toString());
		Statement pre = con.createStatement();
		ResultSet rs = pre.executeQuery("select * from user_info");

		if (rs.next()) {
			log.info(rs.toString());
			log.info(rs.getString("user_id"));
			log.info("user_info table user_id column : {}", rs.getString("user_id"));
		}
	}
}
