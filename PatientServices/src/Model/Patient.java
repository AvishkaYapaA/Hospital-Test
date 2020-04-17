package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Beans.PatientBean;
import DbConnect.DBConnection;

public class Patient {

	//insert-------------------------------------------------------------------------------------------------------------------------
			public String insertPatient(PatientBean pat)
		    {
					String output = "";
					try
					{
						Connection con = DBConnection.connect();
						
						if (con == null)
						{    
							return "Error while connecting to the database for inserting new patient.";
						}
						// create a prepared statement
						String query = "insert into patient"
								+"(`userID`,`userName`,`userAddress`,`nicNo`,`dateOfBirth`,`gender`,`mobileNumber`,`email`,`password`)"
								 + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
								PreparedStatement preparedStmt = con.prepareStatement(query); 
						// binding values
						preparedStmt.setInt(1, 0);
						preparedStmt.setString(2, pat.getUserName());
						preparedStmt.setString(3, pat.getUserAddress());
						preparedStmt.setString(4, pat.getNicNo());
						preparedStmt.setString(5, pat.getDateOfBirth());
						preparedStmt.setString(6, pat.getGender()); 
						preparedStmt.setString(7, pat.getMobileNumber()); 
						preparedStmt.setString(8, pat.getEmail()); 
						preparedStmt.setString(9, pat.getPassword()); 
			
						// execute the statement
						preparedStmt.execute();
						con.close();
						output = "Inserted new patient successfully";
					}
						catch (Exception e)
					{
							output = "Error while inserting the new patient!";
							System.err.println(e.getMessage());
					}
					return output;
		    		}
		
			
			
			
			//view------------------------------------------------------------------------------------------------------------------------
			public String readPatients(){
				
				String output = "";
					try{
						Connection con = DBConnection.connect();
					
					if (con == null){
						return "Error while connecting to the database for reading patients."; 
					}
					// Prepare the html table to be displayed
					output = "<table border=\"2\"><tr>"
							+ "<th>UserID</th>"
							+ "<th>UserName</th>"
							+ "<th>Address</th>"
							+ "<th>NIC</th>"
							+ "<th>Birth Date</th>"
							+ "<th>Gender</th>"
							+ "<th>Mobile No</th>"
							+ "<th>Email</th>"
							+ "</tr>";
					
					String query = "select * from patient";
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(query);
					// iterate through the rows in the result set
					while (rs.next()){
						
						String userID = Integer.toString(rs.getInt("userID"));
						String userName = rs.getString("userName");
						String userAddress = rs.getString("userAddress");
						String nicNo = rs.getString("nicNo");
						String dateOfBirth = rs.getString("dateOfBirth");
						String gender = rs.getString("gender");
						String mobileNumber = rs.getString("mobileNumber");
						String email = rs.getString("email");
						// Add into the html table
						output += "<tr><td>" + userID + "</td>";
						output += "<td>" + userName + "</td>";
						output += "<td>" + userAddress + "</td>";
						output += "<td>" + nicNo + "</td>";
						output += "<td>" + dateOfBirth + "</td>";
						output += "<td>" + gender + "</td>";
						output += "<td>" + mobileNumber + "</td>";
						output += "<td>" + email + "</td>";
						
					}
					con.close();
					// Complete the html table
					output += "</table>";
					}
					catch (Exception e){
						output = "Error while reading the patients info.";
						System.err.println(e.getMessage());
					}
					
			return output;
			
			}
			
			
			
			//update----------------------------------------------------------------------------------------------------------------
			public String updatePatient(PatientBean pat) {
				String output = "";
				try {
					
					Connection con = DBConnection.connect();
					
					
					if (con == null) {
						return "Error while connecting to the database for updating patients.";
					}
					// create a prepared statement
					String query = "UPDATE patient SET userName=?,userAddress=?,nicNo=?,dateOfBirth=?,gender=?,mobileNumber=?,email=?,password=? WHERE userID=?";
					PreparedStatement preparedStmt = con.prepareStatement(query);
					// binding values
					preparedStmt.setString(1, pat.getUserName());
					preparedStmt.setString(2, pat.getUserAddress());
					preparedStmt.setString(3, pat.getNicNo());
					preparedStmt.setString(4, pat.getDateOfBirth());
					preparedStmt.setString(5, pat.getGender()); 
					preparedStmt.setString(6, pat.getMobileNumber()); 
					preparedStmt.setString(7, pat.getEmail()); 
					preparedStmt.setString(8, pat.getPassword()); 
					preparedStmt.setInt(9, pat.getUserID());
					// execute the statement
					preparedStmt.execute();
					con.close();
					output = "Updated patient successfully";
				} catch (Exception e) {
					output = "Error while updating the patient.";
					System.err.println(e.getMessage());
				}
				return output;
			}
			
			
			
			//delete-------------------------------------------------------------------------------------------------------------------
			public String deletePatient(String userid) {
				String output = "";
				try {
					
					Connection con = DBConnection.connect();
					
					if (con == null) {

						return "Error while connecting to the database for deleting.";
					}
					// create a prepared statement
					String query = "delete from patient where userID=?";
					PreparedStatement preparedStmt = con.prepareStatement(query);
					// binding values
					preparedStmt.setInt(1, Integer.parseInt(userid));
					// execute the statement
					preparedStmt.execute();
					con.close();
					output = "Deleted patient successfully";
				} catch (Exception e) {
					output = "Error while deleting the patient.";
					System.err.println(e.getMessage());
				}
				return output;
			}
	
}
