package JdkDatabaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//JDBC API

public class MydatabaseConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//connect with MySQL
		//connection statement ResultSet

		//Fetch records -
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver");//drive support sets up
         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lulu02",
             "root", "ChinniNanna@143");
         Statement statement;
         statement = connection.createStatement();
         ResultSet resultSet;
         resultSet = statement.executeQuery(
             "select * from employee");
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




		}catch(Exception E) {

		}








	}

}
