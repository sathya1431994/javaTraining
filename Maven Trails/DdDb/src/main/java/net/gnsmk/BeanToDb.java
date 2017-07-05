package net.gnsmk;

import java.io.*;
import java.sql.*;
import java.util.*;

class BeanToDb {
	static Connection con = null;
	static boolean isSuccess = true;
	static String query = "";

	public static void main(String[] args) throws IOException {

		List<Employee> emps = new CSV2Bean().getList();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/jdbcpractice", "root", "");
		} catch (Exception ex) {
		}

		if (con != null) {
			System.out.println("Connection Established");

			try {
				for (Employee e : emps) {
					query = "INSERT INTO `jdbcpractice`.`studentdetials` (`name`, `age`, `phone`) VALUES (\"" + e.var1
							+ "\", \"" + e.var2 + "\", \"" + e.var3 + "\");";
					System.out.println(query);
					//isSuccess &= (con.prepareStatement(query).executeUpdate() > 0);
				}
			} catch (Exception ex) {
			} finally {
				if (con != null) {
					try {
						con.close();
					} catch (Exception ex) {
					}
				}
			}

			if (isSuccess) {
				System.out.println("Insertion Success");
			} else {
				System.out.println("Insertion Failed");
			}

		} else {
			System.out.println("Connection Failed");
		}
	}
}