package com.cristianjoel.connectToDB;

//1. Import the packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectToMysql {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "YOUR_USERNAME";
		String pass = "YOUR_PASSWORD";
		try {
			// 2. load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 3. Create a connection
			Connection conn = DriverManager.getConnection(url, user, pass);
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
