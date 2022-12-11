package GUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB
{
    public static void main(String[] args) {

        try
        {
            //laod the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //establish the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?useTimezone=true&serverTimezone=UTC",
                    "root",
                    "");

            //create stmt object
            Statement stmt = con.createStatement();

            //execute the query
            ResultSet rs = stmt.executeQuery("select * from student");

            while(rs.next() == true)
            {
                System.out.println("rno is " + rs.getString(1));
                System.out.println("name is " + rs.getString(2));
                System.out.println("course is " + rs.getString(3));
                System.out.println("fees is " + rs.getString(4));
                System.out.println("\n\n");
            }

            con.close();

        }
        catch (Exception e)
        {
            System.out.println("error in code ");
        }

    }
}
