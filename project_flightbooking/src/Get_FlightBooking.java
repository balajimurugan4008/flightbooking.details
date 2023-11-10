import java.sql.*;
public class Get_FlightBooking {
	public static void main(String[]args)throws Exception {
		get();
	}
public static void get()throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/flightbooking";
	String username="root";
	String password="1110";
	String Query="select *from flightbooking.details";
	Connection obj=DriverManager.getConnection(url,username,password);
	Statement st=obj.createStatement();
	ResultSet rs=st.executeQuery(Query);
	while(rs.next()) {
		System.out.println("fromplace is:"+rs.getString(1));
		System.out.println("toplace is:"+rs.getString(2));
		System.out.println("departuredate is:"+rs.getString(3));
		System.out.println("travellerclass is:"+rs.getString(4));
		System.out.println("flightno is:"+rs.getInt(5));
		System.out.println("ticketprice is:"+rs.getInt(6));
		System.out.println("flightname is:"+rs.getString(7));
		System.out.println("passengerphono is:"+rs.getLong(8));
		
	}
	obj.close();
}
}
