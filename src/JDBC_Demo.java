import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JDBC_Demo {
	
	public static void main(String[] args) throws Exception
	{
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","MYDB","SYSTEM");
		PreparedStatement pst = con.prepareStatement("Update student set student_name=? where student_id=?");
		pst.setString(6,"gunu");
		ResultSet rs = pst.executeQuery("select * from student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"....."+rs.getString(2));
			
		}
		con.close();
	}
	

}
