import java.sql.*;

public class Delete_FlightBooking {
	public static void main(String[]args)throws Exception{
		delete();
	}
	public static  void delete() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/flightbooking";
		String Username="root";
		String password="1110";
		String Query="delete from flightbooking.details where flightno=2045";
		Connection obj=DriverManager.getConnection(url, Username, password);
		PreparedStatement pst=obj.prepareStatement(Query);
		pst.executeUpdate();
		obj.close();
	}

}
