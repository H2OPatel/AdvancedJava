package utilities;

import java.util.regex.Pattern;

public class ProjectUtilities {
	
	public static boolean isBlank(String value) {
		return value == null || value.trim().length() == 0;
	}
	
	public static boolean isNumber(String value) {
		if (isBlank(value)) {
			return false;
		}
		
		try  {
			Integer val = Integer.parseInt(value);	
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
			return false;
		}
		return true;
	}
//	All the Name requiements
//	First Name must start with a letter. 
//	It can contain only letters, numbers, and Spaces, Hyphens (-),
//	Underscores (_).
	
	public static boolean isValidName(String value) {
		String fNamePattern = "^[a-zA-Z]{1}[a-zA-Z0-9-_]*";
		
		// ^[a-zA-Z]{1}[a-zA-Z0-9-_]+ ->  Regex Pattern for Valid FirstName, MiddleName & LastName
	
		return Pattern.matches(fNamePattern, value);
	}
	
//	UserId Requirement
//  User ID must start with a letter.
//	It can contain only letters, numbers, and underscores (_). 
//	Please enter a valid User ID.
	public static boolean isValidUid(String value) {
		String uIdPattern = "^[a-zA-Z]+[a-zA-Z0-9_]+";
		
		// [a-zA-Z]+[a-zA-Z0-9_]
		
		return Pattern.matches(uIdPattern, value);
	}
	
//	Password Requirement
//	 The Password must be 6 to 15 characters. Please Check and enter a valid Password.
	
	
	public static boolean isValidPassword(String Value) {
		
		String pwdPattern = "^\\S{6,15}$";
		
		// ^\S{6,15}$
		
		return Pattern.matches(pwdPattern, Value);
	
		
	}
	
//	City can contain only letters, numbers, and Spaces, Hyphens (-), underscores (_).
//	Please enter a valid City.
	public static boolean isValidCity(String value) {
		String cityNamePattern ="[a-zA-Z0-9-_]+";
		
		// [a-zA-Z0-9-_]+
		
		return Pattern.matches(cityNamePattern, value);
	}
	
//  Phone number contains 10 digits. 
//	Please enter a valid Phone number.
	
	public static boolean isValidPhone(String value) {
		
		String phoneNumberPattern = "^[1-9]\\d{9}$";
		
		// ^[1-9]\d{9}$
		
		return Pattern.matches(phoneNumberPattern, value);
		
		
	}
	
// SSN Must Contain 8 digits.
// Please enter a valid Number.
	
	public static boolean isValidSsn (String value) {
		
		String ssnPattern = "^\\d{8}$";
		
		return Pattern.matches(ssnPattern, value);
		
	}
	
	
	
	
	
	
	
	
	

}
