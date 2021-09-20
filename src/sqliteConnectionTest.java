import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.sql.Connection;
import java.sql.DriverManager;


public class sqliteConnectionTest {
    Connection  conn;
    sqliteConnection db;
    DriverManager dm;
    @Before
    public void setUp() throws Exception {
        dm = Mockito.mock(DriverManager.class);
        db = new sqliteConnection();
    }

    @Test
    public void dbConnector() throws Exception {
        Mockito.doNothing().when(dm).getConnection("jdbc:sqlite:C:\\Users\\tanze\\OneDrive\\Desktop\\semester\\470\\project\\Code(Updated)-20210901T211135Z-001\\supershop management\\EmployeeData.sqlite");
        db.dbConnector();
        System.out.println("dbConnector working without any error");
    }
}