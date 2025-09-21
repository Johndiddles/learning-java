import java.sql.*;

public class DB {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/learnjava", "postgres", "123456");

            String query = "SELECT * FROM influencer_payments WHERE tier = ?";

            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, "Solid Bronze");

            ResultSet result = pst.executeQuery();

            while (result.next()) {
                System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
