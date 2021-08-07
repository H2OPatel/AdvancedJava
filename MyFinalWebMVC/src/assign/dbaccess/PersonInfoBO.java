package assign.dbaccess;

import assign.utilities.ProjectUtilities;

public class PersonInfoBO {

	public PersonInfoBO() {
		super();
		
	}
	
	public void addPersonInfo (PersonInfoVOO personInfoVOO) throws EMailValidationException {
		StringBuffer allMsg = new StringBuffer();
		String errMsg = ProjectUtilities.isValidName(personInfoVOO.getFirstname()) ;
		allMsg.append(errMsg);
		errMsg = ProjectUtilities.isValidName(personInfoVOO.getMiddlename());
		allMsg.append(errMsg);
		errMsg = ProjectUtilities.isValidName(personInfoVOO.getLastname());
		allMsg.append(errMsg);
		
		if (allMsg == null || allMsg.length() ==0) {
			PersonInfoDbAccess personInfoDbAccess = new PersonInfoDbAccess();
			personInfoDbAccess.addPersonInfoEntry(personInfoVOO);
		} else {
			EMailValidationException eMailValidationException = new EMailValidationException(allMsg.toString());
			throw eMailValidationException;
		}
		return;
		
	}
	
	

}
