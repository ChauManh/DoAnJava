
import com.raven.database.JDBCUtil;
import java.sql.Connection;

public class TestJDBC {
    public static void main(String[] args) {
      Connection connection = JDBCUtil.getConnection();
      System.out.print(connection);
    }
}