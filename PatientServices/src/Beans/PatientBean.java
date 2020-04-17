package Beans;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class PatientBean {

	
	private int userID;
	private String userName;
	private String userAddress;
	private String nicNo;
	private String dateOfBirth;
	private String gender;
	private String mobileNumber;
	private String email;
	private String password;
	
	public PatientBean() {
    	
    }

    public PatientBean(String pat)
    {

        JsonObject patientObject = new JsonParser().parse(pat).getAsJsonObject();

        if (patientObject.get("userID") != null) {
            this.userID = patientObject.get("userID").getAsInt();
        }

        this.userName = patientObject.get("userName").getAsString();
        this.userAddress = patientObject.get("userAddress").getAsString();
        this.nicNo = patientObject.get("nicNo").getAsString();
        this.dateOfBirth = patientObject.get("dateOfBirth").getAsString();
        this.gender = patientObject.get("gender").getAsString();
        this.mobileNumber = patientObject.get("mobileNumber").getAsString();
        this.email = patientObject.get("email").getAsString();
        this.password = patientObject.get("password").getAsString();
        
    }
	
    
    public PatientBean(int userid,String username,String address,String nic,String dob,String gender,String mobile_number,String email,String password){
    	
    	this.userID = userid;
    	this.userName = username;
    	this.userAddress = address;
    	this.nicNo = nic;
    	this.dateOfBirth = dob;
    	this.gender = gender;
    	this.mobileNumber = mobile_number;
    	this.email = email;
    	this.password = password;
    	
    }
	
    public PatientBean(String username,String address,String nic,String dob,String gender,String mobile_number,String email,String password){
    	
    
    	this.userName = username;
    	this.userAddress = address;
    	this.nicNo = nic;
    	this.dateOfBirth = dob;
    	this.gender = gender;
    	this.mobileNumber = mobile_number;
    	this.email = email;
    	this.password = password;
    	
    }
	
	
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getNicNo() {
		return nicNo;
	}
	public void setNicNo(String nicNo) {
		this.nicNo = nicNo;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
