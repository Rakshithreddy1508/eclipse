package PreparedStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.CallableStatement;

public class BusinessLogic {

	//CRUD Operations
	void createData() throws SQLException {
		Connection connection = ConnectDB.setupConnection();
		String query ="INSERT INTO employee ( id, name, dept ) VALUES( ?, ?,?)";
//		String query = "insert values into employee(? ,? ,?)  ";
		PreparedStatement myStmt = connection.prepareStatement(query);
		myStmt.setInt(1, 666);
		myStmt.setString(2, "Nagasree");
		myStmt.setString(3, "Management");

		int success = myStmt.executeUpdate();
		System.out.println("Added Successfully " + success);
     	}

	void readData() throws SQLException {


		Connection connection=ConnectDB.setupConnection();

		 Statement statement;
		 statement = connection.createStatement();
         ResultSet resultSet;
         resultSet = statement.executeQuery(
             "select * from employee where id>=111");
         int id;
         String name;
         String dept;
         while (resultSet.next()) {
             id = resultSet.getInt("id");
             name = resultSet.getString("name");
             dept=resultSet.getString("dept");
             System.out.println("id : " + id
                                + " name : " + name +"  departmet:"+ dept);
         }



     //    "UPDATE your_table SET column1 = ?, column2 = ? WHERE condition_column = ?
	}

	void updateData() throws SQLException {


		Connection connection = ConnectDB.setupConnection();
		String query = "update employee set name= ? where id = ? ";
		PreparedStatement myStmt = connection.prepareStatement(query);
		myStmt.setString(1, "Shravya");
		myStmt.setInt(2, 333);
		boolean success = myStmt.execute();
		System.out.println(" Successfully " + success);



	}


	void deletData() throws SQLException {
		Connection connection = ConnectDB.setupConnection();
		String query = "delete from employee where id = ? ";
		PreparedStatement myStmt = connection.prepareStatement(query);
		myStmt.setInt(1, 1001);
		boolean success = myStmt.execute();
		System.out.println("Deleted Successfully " + success);

	}
	void batchProcess() throws SQLException {
		Connection connection = ConnectDB.setupConnection();



		Statement stmt = connection.createStatement();

			stmt.addBatch("insert into employee values(888 ,'sahana','SW dept')");
			stmt.addBatch("insert into employee values(999 ,'Apoorva','SW dept')");
			stmt.addBatch("insert into employee values(1001 ,'Keerthana','SW dept')");
			stmt.addBatch("insert into employee values(889 ,'Ajith','SW dept')");


			stmt.executeBatch();//executing the batch
			System.out.println("Batch executed successfully!");

//			Submits a batch of commands to the database for execution and if all
//			commands execute successfully, returns an array of update counts.

	}
	void StoredProceduresMore() throws SQLException {

		Connection connection = ConnectDB.setupConnection();
		String query="call pull_emplyoee ()";
		CallableStatement stmt = (CallableStatement) connection.prepareCall(query);
		//The interface used to execute SQL stored procedures
		ResultSet resultSet = stmt.executeQuery(query);
		//to display result sets//

		int id;
		String name;
		String dept;

		while (resultSet.next()) {
			id = resultSet.getInt("id");
			name = resultSet.getString("name");
			dept = resultSet.getString("dept");
			System.out.println("id : " + id + " name : " + name + "  departmet:" + dept);
		}

	}

		void TransactionsConcepts() throws SQLException {
			Connection connection = ConnectDB.setupConnection();
				String query = "INSERT INTO employee ( id, name, dept ) VALUES( ?, ?,?)";
				//String query = "insert values into employee(? ,? ,?)  ";
				PreparedStatement myStmt = connection.prepareStatement(query);
				connection.setAutoCommit(false);  //By default its always true
				myStmt.setInt(1, 504);
				myStmt.setString(2, "Nagasree");
				myStmt.setString(3, "S/W dev");


				int success = myStmt.executeUpdate();
				connection.commit();
				//Makes all changes made since the previouscommit/rollback permanent and releases any database lockscurrently held by this Connection object.
				//This method should beused only when auto-commit mode has been disabled.
				connection.rollback();
				//Undoes all changes made in the current transactionand releases any database locks currently heldby this Connection object.
				//This method should beused only when auto-commit mode has been disabled.
				System.out.println("Added Successfully " + success);

			}
    }


