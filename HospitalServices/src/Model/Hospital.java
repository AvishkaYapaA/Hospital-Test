
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Beans.HospitalBean;
import DbConnect.DBConnection;

public class Hospital {
	

	//HealthcareService/Hospital
	
// Insert Hospital -------------------------------------------------------------------------------------------------------------------


	public String insertHospital(HospitalBean doc) {

		//
    	String output = "";
		try
		{
			Connection con = DBConnection.connect();
			if (con == null)
			{    
				return "Error while connecting to the database for inserting.";
			}
			// create a prepared statement
			String query = "insert into hospital"
					+"(`HospitalID`,`MOHcode`,`ManagerName`,`HospitalName`,`Address`,`TPnumber`,`Location`,`Username`,`Password`)"
					 + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
					PreparedStatement preparedStmt = con.prepareStatement(query); 
					
					
			// binding values
			preparedStmt.setInt(1, 0);
			preparedStmt.setString(2, doc.getMOHcode());
			preparedStmt.setString(3, doc.getManagerName());
			preparedStmt.setString(4, doc.getHospitalName());
			preparedStmt.setString(5, doc.getAddress());
			preparedStmt.setInt(6, doc.getTPnumber());
			preparedStmt.setString(7, doc.getLocation());
			preparedStmt.setString(8, doc.getUsername());
			preparedStmt.setString(9, doc.getPassword());

			// execute the statement
			preparedStmt.execute();
			con.close();
			output = "Inserted Hospital successfully";
		}
			catch (Exception e)
		{
				output = "Error while inserting hospital";
				System.err.println(e.getMessage());
		}
		return output;
	}


	
// Read Hospital -------------------------------------------------------------------------------------------------------------------

	
	public String readHospital() {
		String output = "";
		try {
			Connection con = DBConnection.connect();
			if (con == null) {
				return "Error while connecting to the database for reading.";
			}
			
			
			// Prepare the html table to be displayed

			output = "<table border=\"1\">"

					+ "<tr>"
					+ "<th>MOH Registration Code</th>"
					+ "<th>Manager Name</th>"
					+ "<th>Hospital Name</th>"
					+ "<th>Address</th>"
					+ "<th>Telephone Number</th>"
					+ "<th>Location</th>"
					+ "</tr>";
					

			String query = "select * from hospital";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			// iterate through the rows in the result set
			while (rs.next()) {
				
				
				String HospitalID = Integer.toString(rs.getInt("HospitalID"));
				String MOHcode = rs.getString("MOHcode");
				String ManagerName = rs.getString("ManagerName");
				String HospitalName = rs.getString("HospitalName");
				String Address = rs.getString("Address");
				String TPnumber = rs.getString("TPnumber");
				String Location = rs.getString("Location");
				

				
				// Add into the html table
				output += "<tr><td>" + MOHcode + "</td>";
				output += "<td>" + ManagerName + "</td>";
				output += "<td>" + HospitalName + "</td>";
				output += "<td>" + Address + "</td>";
				output += "<td>" + TPnumber + "</td>";
				output += "<td>" + Location + "</td>";
			}

			con.close();
			// Complete the html table
			output += "</table>";
		} catch (Exception e) {
			output = "Error while reading the hospital.";
			System.err.println(e.getMessage());
		}
		return output;
	}
	

	
// Update Hospital -------------------------------------------------------------------------------------------------------------------


	 public String updateHospital(HospitalBean doc) {

	    	String output = "";
			
			try {
				Connection con = DBConnection.connect();
		
				if (con == null) {
					return "Error while connecting to the database for updating.";
				}
				
				// create a prepared statement
				String query = "UPDATE hospital SET MOHcode = ?,ManagerName = ?,HospitalName = ?,Address = ?,TPnumber = ?,Location = ?,Username = ?,Password = ? WHERE HospitalID=?";
				
					PreparedStatement preparedStmt = con.prepareStatement(query);
				
				// binding values
				preparedStmt.setString(1, doc.getMOHcode());
				preparedStmt.setString(2, doc.getManagerName());
				preparedStmt.setString(3, doc.getHospitalName());
				preparedStmt.setString(4, doc.getAddress());
				preparedStmt.setInt(5, doc.getTPnumber());
				preparedStmt.setString(6, doc.getLocation());
				preparedStmt.setString(7, doc.getUsername());
				preparedStmt.setString(8, doc.getPassword());
				preparedStmt.setInt(9, doc.getHospitalID());
				
				
				
				// execute the statement
				preparedStmt.execute();
				con.close();
				output = "Updated successfully";
			} catch (Exception e) {
				output = "Error while updating the item.";
				System.err.println(e.getMessage());
			}
			return output;
		}
	 

// Remove Hospital -------------------------------------------------------------------------------------------------------------------

	 public String removeHospital(String HospitalID) {

	    	String output = "";
			try {
				Connection con = DBConnection.connect();

				if (con == null) {

					return "Error while connecting to the database for deleting.";
				}
				
				// create a prepared statement
				String query = "delete from hospital where HospitalID=?";
				PreparedStatement preparedStmt = con.prepareStatement(query);
				
				// binding values
				preparedStmt.setInt(1, Integer.parseInt(HospitalID));
				
				// execute the statement
				preparedStmt.execute();
				con.close();
				output = "Deleted Hospital successfully";
				
			} catch (Exception e) {
				
				System.out.println("erro deleting");
				output = "Error while deleting the hospital.";
				System.err.println(e.getMessage());
			}
			return output;
	    }
	

}

