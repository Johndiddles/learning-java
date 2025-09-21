import java.sql.*;

public class DB {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/domeasolid", "postgres", "123456");
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM influencer_payments");
            while (result.next()) {
                System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
