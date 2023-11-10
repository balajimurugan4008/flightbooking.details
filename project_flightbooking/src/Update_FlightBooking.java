import java.sql.*;
public class Update_FlightBooking {
	public static void main(String[]args) throws Exception{
		update();
	}
	public static void update()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/flightbooking";
		String username="root";
		String password="1110";
		String Query="update flightbooking.details set flightname ='Airindia' where flightno=4008";
		Connection obj=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=obj.prepareStatement(Query);
		pst.executeUpdate();
		obj.close();
		}
}
