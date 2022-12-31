package swingwindows;

import java.sql.*;

/*  Add the elements to the db function
        welcome panel - connection
        clicking going to different panel
        search panel and function
    * */
public class DbmsFunc {
    public static Connection con;
    static public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Student", "root", "Navaneeth@2230"
            );
            if (con != null) {
                System.out.println("Success");
            }
            else {
                System.out.println("Nope");
            }
        } catch (Exception e) {
            System.out.println("Connection error!");
        }
    }
    public static void add(String regNo, String name, int mark1, int mark2, int mark3) throws SQLException {
        Statement stmt = con.createStatement();
        String query = String.format("INSERT INTO students(RegisterNumber, Name, Mark1, Mark2, Mark3) VALUES ('%s', '%s', %d, %d, %d);", regNo, name, mark1, mark2, mark3);
        stmt.executeUpdate(query);
        con.close();
    }
}
