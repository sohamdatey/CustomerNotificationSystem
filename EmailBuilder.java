package in.co.raystech.maven.project4.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Class that build Application Email messages
 * 
 * @author Front Controller
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */

public class EmailBuilder {
	/**
	 * Returns Successful User Registration Message
	 * 
	 * @param map
	 *            : Message parameters
	 * @return
	 */
	public static String getUserRegistrationMessage(HashMap<String, String> map) {
		StringBuilder msg = new StringBuilder();

		msg.append("<HTML><BODY>");
		msg.append("Registration is successful for Online Food Ordering(OFO)");
		msg.append("<H1>Hi! Greetings from OFO!</H1>");
		msg.append(
				"<P>Congratulations for registering on OFO! You can now access your OFO account online - anywhere, anytime and enjoy ordering food</P>");
		
		msg.append("<P><B>Login Id : " + map.get("login") + "<BR>" + " Password : " + map.get("password") + "</B></p>");
		msg.append(	
				"<P> As a security measure, we recommended that you change your password after you first log in.</p>");
		msg.append(
				"<p>For any assistance, please feel free to call us at +91 94248889956 or 8962976573 helpline numbers.</p>");
		msg.append("<p>You may also write to us at hrd@ofo.co.in.</p>");
		msg.append(
				"<p>We assure you the best service at all times and look forward to a warm and long-standing association with you.</p>");
		msg.append("<P><a href='http://www.ofo.com' >-OFO</a></P>");
		msg.append("</BODY></HTML>");

		return msg.toString();
	}

	/**
	 * Returns Email message of Forget Password
	 * 
	 * @param map
	 *            : params
	 * @return
	 */

	public static String getForgetPasswordMessage(HashMap<String, String> map) {
		StringBuilder msg = new StringBuilder();

		msg.append("<HTML><BODY>");
		msg.append("<H1>Your password is reccovered !! " + map.get("userName") + "</H1>");
		/*
		 * msg.append("<P>To access account user login ID : " + map.get("login")
		 * + " and password " + map.get("password") + "</P>");
		 */
		msg.append("<P><B>To access account user Login Id : " + map.get("login") + "<BR>" + " Password : "
				+ map.get("password") + "</B></p>");
		msg.append("</BODY></HTML>");

		return msg.toString();
	}

	/**
	 * Returns Email message of Change Password
	 * 
	 * @param map
	 * @return
	 */
	public static String getChangePasswordMessage(HashMap<String, String> map) {
		StringBuilder msg = new StringBuilder();

		msg.append("<HTML><BODY>");
		msg.append("<H1>Your Password has been changed Successfully !! " + map.get("userName") + "</H1>");
		/*
		 * msg.append("<P>To access account user login ID : " + map.get("login")
		 * + " and password " + map.get("password") + "</P>");
		 */
		msg.append("<P><B>To access account user Login Id : " + map.get("login") + "<BR>" + " Password : "
				+ map.get("password") + "</B></p>");
		msg.append("</BODY></HTML>");

		return msg.toString();
	}

}
