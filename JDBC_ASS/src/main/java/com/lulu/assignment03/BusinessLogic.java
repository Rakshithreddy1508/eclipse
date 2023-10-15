package com.lulu.assignment03;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusinessLogic {

	//CRUD Operations
	void createData() throws SQLException {
		Connection connection = ConnectDB.setupConnection();
		String query ="INSERT INTO FashionRetailers (Id, Name, Age,City,Phone_Number ) VALUES( ?,?,?,?,?)";
//		String query = "insert values into employee(? ,? ,?)  ";
		PreparedStatement myStmt = connection.prepareStatement(query);
		myStmt.setInt(1, 04);
		myStmt.setString(2, "Mahesh");
		myStmt.setInt(3, 40);
		myStmt.setString(4,"Bangalore");
		myStmt.setString(5,"8123113107");

		int success = myStmt.executeUpdate();
		System.out.println("Added Successfully " + success);
     	}

	void readData() throws SQLException {


		Connection connection=ConnectDB.setupConnection();

		 Statement statement;
		 statement = connection.createStatement();
         ResultSet resultSet;
         resultSet = statement.executeQuery(
             "select * from FashionRetailers where id>=01");  //Id, Name, Age,City,Phone_Number
         int Id;
         String Name;
         int Age;
         String City ;
         String Phone_Number ;

         while (resultSet.next()) {
        	 Id = resultSet.getInt("Id");
        	 Name = resultSet.getString("Name");
        	 Age=resultSet.getInt("Age");
        	 City = resultSet.getString("City");
        	 Phone_Number = resultSet.getString("Phone_Number");
             System.out.println("Id : " + Id
                                + " Name : " +Name   +"  Age:"+Age   + "  City:" +City   + "  Phone_Number:" +Phone_Number);
         }
	}

	void updateData() throws SQLException {


		Connection connection = ConnectDB.setupConnection();
		String query = "update FashionRetailers set name= ? where id = ? ";
		PreparedStatement myStmt = connection.prepareStatement(query);
		myStmt.setString(1, "Nilay");
		myStmt.setInt(2, 01);
		boolean success = myStmt.execute();
		System.out.println(" Successfully " + success);

	}

	void deletData() throws SQLException {
		Connection connection = ConnectDB.setupConnection();
		String query = "delete from FashionRetailers where id = ? ";
		PreparedStatement myStmt = connection.prepareStatement(query);
		myStmt.setInt(1, 02);
		boolean success = myStmt.execute();
		System.out.println("Deleted Successfully " + success);

	}
	}
