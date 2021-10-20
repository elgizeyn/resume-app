package com.company.dao.inter;

import java.sql.Connection;
import java.sql.DriverManager;

public class AbstractDao {

    public Connection connect()
            throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        com.mysql.jdbc.Driver s;
        String url = "jdbc:mysql://localhost:3306/resumedbapp";
        String username = "root";
        String password = "0557801450";
        Connection c = DriverManager.getConnection(url, username, password);
        return c;
    }
}
