package klassen.Database;

/**
 * Package: klassen.Database
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 02.03.2018 2018
 */

import klassen.String.StringRegex;
import org.codehaus.groovy.runtime.powerassert.SourceText;

import java.sql.*;

public class HsqlDB {
    ResultSet rs = null;
    private boolean next;

    public ResultSet HsqlCall(String querry) {

        try {
            // Treiberklasse laden
            Class.forName("org.hsqldb.jdbcDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("Treiberklasse nicht gefunden!");
            return rs;
        }

        Connection con = null;

        try {
            con = DriverManager.getConnection(
                    "jdbc:hsqldb:file:C:/Users/Hoang.Son.Nguyen/OneDrive/Public/HsqlDB; shutdown=true", "root", "");
            Statement stmt = con.createStatement();

            // Alle Kunden ausgeben
            String sql = querry;
            //stmt.executeUpdate(sql);
            stmt.executeQuery(sql);
            rs = stmt.executeQuery(sql);

            printResult(rs);

            // Resultset schließen
            rs.close();

            // Statement schließen
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return rs;
    }

    public void printResult(ResultSet resultSet) throws SQLException {
        if(resultSet == null){
            return;
        }
        StringRegex stringRegex = new StringRegex();
        ResultSetMetaData rsmd = resultSet.getMetaData();
        int coulumCount = rsmd.getColumnCount();

        for (int i = 0; i < coulumCount; i++) {
            System.out.print(stringRegex.extendString(rsmd.getColumnLabel(i + 1), 15));
        }
        System.out.println();
        while (resultSet.next()) {
            for (int i = 0; i < coulumCount; i++) {
                System.out.print(stringRegex.extendString(rs.getString(i + 1), 15));
            }
            System.out.println();

        }

    }

}

