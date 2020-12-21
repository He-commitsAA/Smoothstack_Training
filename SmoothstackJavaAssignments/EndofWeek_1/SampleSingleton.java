/**
 * 
 */
package com.ss.sf.williamtraining.javaendweekone;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author William
 *
 *Fixed Singleton class to have double checked locking.
 */
public class SampleSingleton {

	private static Connection conn = null;

	private static SampleSingleton instance = null;

	public static SampleSingleton getInstance() {
		if (instance == null) {
			synchronized (SampleSingleton.class) {
				if (instance == null) {
					instance = new SampleSingleton();
				}
			}
		}
		return instance;
	}
	
	/*
	 * Fixed BigDecimal-related errors.
	 */

	public static void databaseQuery(BigDecimal input) {
		conn = DriverManager.getConnection("url of database");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select id from table");
		BigDecimal x;
		while (rs.next()) {
			x = input.multiply(new BigDecimal(rs.getInt(1)));
		}
	}
}