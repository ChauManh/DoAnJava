/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.database;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DANG GIA BAO
 */
public class JDBCUtil {
    public static Connection getConnection() {
        Connection c = null;
        String url = "jdbc:mysql://172.20.29.230:3306/ql_banvexemphim?user=user&password=&useUnicode=true&characterEncoding=utf8";
        String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver);
            c = DriverManager.getConnection(url);
            System.out.println("Connected to database");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }
}
