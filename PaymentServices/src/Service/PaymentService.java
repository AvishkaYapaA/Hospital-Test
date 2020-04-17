package Service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import Beans.PaymentBean;
import Model.Payment;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/Payment")
public class PaymentService {

	Payment payment = new Payment();

	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML)
	public String readPayment() {
		return payment.readPayment();
	}

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String insertPayment(String paymentData) {

		PaymentBean paymentb = new PaymentBean(paymentData);

		String output = payment.insertPayment(paymentb);
		return output;
	}

	@DELETE
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteItem(String paymentData) {

		JsonObject PaymentObject = new JsonParser().parse(paymentData).getAsJsonObject();

		String pamentID = PaymentObject.get("pamentID").getAsString();
		String output = payment.deletePayment(pamentID);
		return output;
	}

	@PUT
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String updatePayment(String Payment) {

		PaymentBean doc = new PaymentBean(Payment);

		String output = payment.updatePayment(doc);
		return output;
	}

}
