package assign.dbaccess;

import assign.utilities.ProjectUtilities;

public class ContactInfoBO {

	public ContactInfoBO() {
		super();
		
	}
	public static void addContactInfo (ContactInfoVOO contactInfoVOO) throws EMailValidationException {
		StringBuffer allMsg = new StringBuffer();
		String errMsg = ProjectUtilities.isValidCity(contactInfoVOO.getCity());
		allMsg.append(errMsg);
		errMsg = ProjectUtilities.isValidPhone(contactInfoVOO.getPhone());
		allMsg.append(errMsg);
		
		if (allMsg == null || allMsg.length() == 0) {
			ContactInfoDbAccess contactInfoDbAccess = new ContactInfoDbAccess();
			contactInfoDbAccess.addContactInfoEntry(contactInfoVOO);
		} else {
			EMailValidationException eMailValidationException = new EMailValidationException(allMsg.toString());
			throw eMailValidationException;
		}
	}

	
}
