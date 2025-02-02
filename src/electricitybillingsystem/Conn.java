package electricitybillingsystem;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "Sanket@2003");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}