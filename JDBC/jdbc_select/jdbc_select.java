package nikki;

import java.sql.*;

public class jdbc_select{
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root", "Nikki@07");
			Statement st = con.createStatement();
			ResultSet rSet = st.executeQuery("select * from students");
			while(rSet.next()) {
				System.out.println(rSet.getInt(1)+" "+rSet.getString(2)+" "+rSet.getInt(3));
				
			}
		
			rSet.close();
			st.close();
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR !!!! :: "+e);
		}
	}
}
