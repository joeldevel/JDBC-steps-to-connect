package com.cristianjoel.connectToDB;

//1. Import the packages
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToSqlite {

	public static void main(String[] args) {

		try {
			// 2. Import the driver
			Class.forName("org.sqlite.JDBC");
			String url = "jdbc:sqlite:sample.sqlite";
			// 3. Create a connection
			Connection conn = DriverManager.getConnection(url);
			if (conn != null) {
				System.out.println("Conection OK");
				System.out.println("-----------------------------------");

				// 4. Create a query
				String query = "SELECT * FROM fruits";

				// 5. Execute the query
				Statement stm = conn.createStatement();
				ResultSet res = stm.executeQuery(query);

				// 6. Do something with the results
				String fruit = "";

				while (res.next()) {
					fruit = "Fruit name:" + res.getString(1).trim() + " fruit color: " + res.getString(2).trim();

					System.out.println(fruit);
				}
				// 7. Close the connection
				conn.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}