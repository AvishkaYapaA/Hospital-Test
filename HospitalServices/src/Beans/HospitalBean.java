package Beans;

import javax.xml.bind.annotation.XmlRootElement;



import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class HospitalBean {
	
	//Create Variable
	int HospitalID;
	private String MOHcode; 
	private String ManagerName; 
	private String HospitalName; 
	private String Address; 
	private int TPnumber; 
	private String Location; 
	private String Username; 
	private String Password; 
	
	public HospitalBean() {
		
	}
	
	public HospitalBean(String hos) {
		JsonObject hospitalObject = new JsonParser().parse(hos).getAsJsonObject();

        if (hospitalObject.get("HospitalID") != null) {
            this.HospitalID = hospitalObject.get("HospitalID").getAsInt();
        }

        this.MOHcode = hospitalObject.get("MOHcode").getAsString();
        this.ManagerName = hospitalObject.get("ManagerName").getAsString();
        this.HospitalName = hospitalObject.get("HospitalName").getAsString();
        this.Address = hospitalObject.get("Address").getAsString();
        this.TPnumber = hospitalObject.get("TPnumber").getAsInt();
        this.Location = hospitalObject.get("Location").getAsString();
        this.Username = hospitalObject.get("Username").getAsString();
        this.Password = hospitalObject.get("Password").getAsString();
        
	}
	public HospitalBean(int HospitaliD, String MOhcode, String Managername,
			String Hospitalname,String address,int Tpnumber, 
			String location, String username, String password) {
    	
    	 this.HospitalID = HospitaliD;
         this.MOHcode = MOhcode;
         this.ManagerName = Managername;
         this.HospitalName = Hospitalname;
         this.Address = address;
         this.TPnumber  = Tpnumber;
         this.Location = location;
         this.Username = username;
         this.Password = password;
         
       

    }
	
	public HospitalBean(String MOhcode, String Managername,
			String Hospitalname,String address,int Tpnumber, 
			String location, String username, String password) {
    	
         this.MOHcode = MOhcode;
         this.ManagerName = Managername;
         this.HospitalName = Hospitalname;
         this.Address = address;
         this.TPnumber  = Tpnumber;
         this.Location = location;
         this.Username = username;
         this.Password = password;
         
       

    }

	public int getHospitalID() {
		return HospitalID;
	}

	public void setHospitalID(int hospitalID) {
		HospitalID = hospitalID;
	}

	public String getMOHcode() {
		return MOHcode;
	}

	public void setMOHcode(String mOHcode) {
		MOHcode = mOHcode;
	}

	public String getManagerName() {
		return ManagerName;
	}

	public void setManagerName(String managerName) {
		ManagerName = managerName;
	}

	public String getHospitalName() {
		return HospitalName;
	}

	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getTPnumber() {
		return TPnumber;
	}

	public void setTPnumber(int tPnumber) {
		TPnumber = tPnumber;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
