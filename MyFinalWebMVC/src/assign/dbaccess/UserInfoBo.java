package assign.dbaccess;

import assign.utilities.ProjectUtilities;

public class UserInfoBo {

	public UserInfoBo() {
		super();
	}

	public void addUserInfo(UserInfoVOO userInfo) throws EMailValidationException {
		StringBuffer AllMsg = new StringBuffer();
		String err = ProjectUtilities.isValidUid(userInfo.getUserid());
		AllMsg.append(err);
		err = ProjectUtilities.isValidPwd(userInfo.getPassword());
		AllMsg.append(err);
		
		if (AllMsg == null || AllMsg.length() == 0) {
			UserInfoDbAccess userdb = new UserInfoDbAccess();
			userdb.addUserInfoEntry(userInfo);
		} else {
			EMailValidationException eMailValidationException = new EMailValidationException(AllMsg.toString());
			throw eMailValidationException;
		}
		return;
	}
	public void deleteUserInfo(String userid) throws EMailValidationException {
		String error = ProjectUtilities.isValidUid(userid);
		
		if (error == null || error.length() == 0 ) {
			UserInfoDbAccess userdb = new UserInfoDbAccess();
			userdb.deleteUserInfoEntry(userid);
		} else {
			EMailValidationException eMailValidationException = new EMailValidationException(error.toString());
			throw eMailValidationException;
		}
		return;
	}

}
