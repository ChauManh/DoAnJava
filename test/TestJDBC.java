
import com.raven.database.JDBCUtil;
import java.sql.Connection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DANG GIA BAO
 */
public class TestJDBC {
        public static void main(String[] args) {
        Connection connection = JDBCUtil.getConnection();
        System.out.println(connection);
    }
}
