import java.sql.*;

public class Database
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/ppa41";
        String Username = "root";
        String Password = "root";
        String Query = "select * from student";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);

        Statement sobj = cobj.createStatement();

        ReseultSet robj = sobj.executeQuery(Query);

        while(robj.next())
        {
            System.out.println("RID:"+robj.getInt("RID"));
            System.out.println("Name:"+robj.getInt("Name"));
            System.out.println("City:"+robj.getInt("City"));
            System.out.println("Marks:"+robj.getInt("Marks"));
        }
    }
}