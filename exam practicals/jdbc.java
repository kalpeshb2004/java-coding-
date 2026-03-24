
import java.sql.*;

public class jdbc {
    public static void main(String[] args) {
        
        try {
            //load driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //create connection
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb" , "root" , "password"
        );

        //create statement
        Statement stmt = con.createStatement();

        //insert data
        stmt.executeUpdate("INSERT INTO student VALUES(1,'aadi')");

        //retrive rs
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        while(rs.next()){
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }

        //con close
        con.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
