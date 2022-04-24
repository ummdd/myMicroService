package db;

import java.sql.*;

public class BaseDatabase {

    public void checkDBExists() throws SQLException {
        Connection con = null;
        ResultSet rs = null;
        String url = "jdbc:postgresql://localhost:5432/";
        String user = "postgres";
        String password = "1";
        String dbName = "";
        String externalDbName = "postgres";
        boolean isEqual = false;

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, password);

            if (con != null) {
                PreparedStatement ps = con.prepareStatement("SELECT datname FROM pg_database WHERE datistemplate = false;");
                rs = ps.executeQuery();
                while (rs.next()) {
                    dbName = rs.getString(1);
                    if (dbName.equals(externalDbName))
                        isEqual = true;
                }

                if (!isEqual)
                    ps.executeQuery(String.format("create database %s",externalDbName));
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null)
            rs.close();
        }
    }
}
