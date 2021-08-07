package assign.utilities;

import java.util.regex.Pattern;

public class ProjectUtilities {
	
//	public static String isBlank(String value) {
//		String error = "";
//		if(value == null || value.trim().length() == 0) {
//			error ="Can't be blank";
//		}
//		return error;
//	}
	
	public static String isValidUid(String value) {
		String error = "";
		String uIdPattern = "^[a-zA-Z]+[a-zA-Z0-9_]+";
		
		
		
		if(value == null || value.trim().length() == 0 || !Pattern.matches(uIdPattern, value)) {
			error = "UserId Requirement\r\n"
					+ "//  User ID must start with a letter.\r\n"
					+ "//	It can contain only letters, numbers, and underscores (_). \r\n"
					+ "//	Please enter a valid User ID.";
		}
		return error;
	}
	
	public static String isValidPwd(String value) {
		String error = "";
		String uIdPattern = "^\\S{6,15}$";
		
		
		
		if(value == null || value.trim().length() == 0 || !Pattern.matches(uIdPattern, value)) {
			error = "Password is not valid";
					
		}
		return error;
	}
	public static String isValidName(String value) {
		String error = "";
		String uIdPattern = "^[a-zA-Z]{1}[a-zA-Z0-9-_]*";
		
		
		
		if(value == null || value.trim().length() == 0 || !Pattern.matches(uIdPattern, value)) {
			error = " Name can't be blank.\"+\"First Name must start with a letter. \"\r\n"
					+ "					+ \"	It can contain only letters, numbers, and Spaces, Hyphens (-),\"\r\n"
					+ "					+ \"	Underscores (_).<br/>";
		}
		return error;
	}

	public static String isValidCity(String value) {
		String error = "";
		String uIdPattern = "[a-zA-Z0-9-_]+";
		
		
		
		if(value == null || value.trim().length() == 0 || !Pattern.matches(uIdPattern, value)) {
			error = "City Name Requirement\r\n"
					+ "//	City can contain only letters, numbers, and Spaces, Hyphens (-), underscores (_)."
					+ "//	Please enter a valid City Name.";
		}
		return error;
	}
	public static String isValidPhone(String value) {
		String error = "";
		String uIdPattern = "[0-9]{10}";
		
		
		
		if(value == null || value.trim().length() == 0 || !Pattern.matches(uIdPattern, value)) {
			error = "Phone number Requirement\r\n"
					+ "//	Phone number contains 10 digits."
					+ "//	Please enter a valid Phone number.";
		}
		return error;
	}
	
	
	

}
