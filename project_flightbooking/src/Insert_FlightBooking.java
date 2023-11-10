import java.sql.*;

public class Insert_FlightBooking {
	public static void main(String[]args) throws Exception {
		insert();
	}
	public static void insert() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/flightbooking";
		String Username="root";
		String password="1110";
		String Query="insert into details values(?,?,?,?,?,?,?,?,?)";
		Connection obj=DriverManager.getConnection(url, Username, password);
		PreparedStatement pst=obj.prepareStatement(Query);
		pst.setString(1,"delhi");
		pst.setString(2, "goa");
		pst.setString(3, "2023-12-15 09:08:45" );
		pst.setString(4,"secondclass");
		pst.setInt(5, 2045);
		pst.setInt(6, 3500);
		pst.setString(7, "indigo");	
		pst.setLong(8, 9809674343l);
		pst.setBoolean(9, true);
		pst.executeUpdate();
		obj.close();
	}

}
