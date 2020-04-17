package Beans;

import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@XmlRootElement
public class DoctorBean {
	
	
	//Create Variables
    int DoctorId;
    private String Dname;
    private String DRegNo;
    private String Specialization;
    private int ContactNo;
    private String Address;
    private String Email;
    private String HospitalName;

    public DoctorBean() {
    	
    }

    public DoctorBean(String doc)
    {

        JsonObject doctorObject = new JsonParser().parse(doc).getAsJsonObject();

        if (doctorObject.get("DoctorId") != null) {
            this.DoctorId = doctorObject.get("DoctorId").getAsInt();
        }

        this.Dname = doctorObject.get("Dname").getAsString();
        this.DRegNo = doctorObject.get("DRegNo").getAsString();
        this.Specialization = doctorObject.get("Specialization").getAsString();
        this.ContactNo = doctorObject.get("ContactNo").getAsInt();
        this.Address = doctorObject.get("Address").getAsString();
        this.Email = doctorObject.get("Email").getAsString();
        this.HospitalName = doctorObject.get("HospitalName").getAsString();
        
    }

    public DoctorBean(int doctorid, String doctorName, String Dregno, String specialization, int contactNo, 
    		String address, String email, String hospitalname) {
    	
    	 this.DoctorId = doctorid;
         this.Dname = doctorName;
         this.DRegNo=Dregno;
         this.Specialization = specialization;
         this.ContactNo = contactNo;
         this.Address = address;
         this.Email = email;
         this.HospitalName = hospitalname;
       

    }

    public DoctorBean(String doctorName, String Dregno, String specialization, int contactNo, 
    		String address, String email, String hospitalname)
    {

        this.Dname = doctorName;
        this.DRegNo=Dregno;
        this.Specialization = specialization;
        this.ContactNo = contactNo;
        this.Address = address;
        this.Email = email;
        this.HospitalName = hospitalname;

    }

	public int getDoctorId() {
		return DoctorId;
	}

	public void setDoctorId(int doctorId) {
		DoctorId = doctorId;
	}

	public String getDname() {
		return Dname;
	}

	public void setDname(String dname) {
		Dname = dname;
	}

	public String getDRegNo() {
		return DRegNo;
	}

	public void setDRegNo(String dRegNo) {
		DRegNo = dRegNo;
	}

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

	public int getContactNo() {
		return ContactNo;
	}

	public void setContactNo(int contactNo) {
		ContactNo = contactNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getHospitalName() {
		return HospitalName;
	}

	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}

  
}
