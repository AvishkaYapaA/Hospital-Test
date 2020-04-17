package Service;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import Beans.PatientBean;
import Model.Patient;


@Path("/Patients")
public class PatientService {

	Patient patientObj = new Patient();
	
	
	@POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String insertPatient(String patientData) {

		PatientBean pb = new PatientBean(patientData);

        String output = patientObj.insertPatient(pb);
        return output;

    }
	
	
	@GET
  	@Path("/")
  	@Produces(MediaType.TEXT_HTML)
  	public String readPatients() {
  		return patientObj.readPatients();
  	}
	
	
	@PUT
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String updatePatient(String patientData) {

		PatientBean pb = new PatientBean(patientData);

        String output = patientObj.updatePatient(pb);
        return output;

    }
	
	
	 @DELETE
	    @Path("/")
	    @Consumes(MediaType.APPLICATION_JSON)
	    @Produces(MediaType.TEXT_PLAIN)
	    public String deletePatient(String patientData) {

	  
			JsonObject patientObject = new JsonParser().parse(patientData).getAsJsonObject();

		    String userid = patientObject.get("userID").getAsString();
	        String output = patientObj.deletePatient(userid);

	        return output;

	    }
}
