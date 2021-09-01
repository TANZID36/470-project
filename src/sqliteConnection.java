import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class sqliteConnection {
	Connection con = null;
	public static Connection dbConnector ()
	{D:
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\tanze\\OneDrive\\Desktop\\semester\\470\\project\\Code(Updated)-20210901T211135Z-001\\supershop management\\EmployeeData.sqlite");
			//JOptionPane.showMessageDialog(null, "Connection Successful");
			return con;
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
