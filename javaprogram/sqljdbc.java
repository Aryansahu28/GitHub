import java.sql.*;

public class sqljdbc {
    public static void main(String args[]) throws Exception{
        String Driver_class= "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/226301038_aryan";
        Class.forName(Driver_class);
        Connection con = DriverManager.getConnection(url, "root","Aryansahu@471201");
        Statement stmt = con.createStatement();
        String sql = "Select * from employee";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
        }
        rs.close();
        con.close();

    }
}
