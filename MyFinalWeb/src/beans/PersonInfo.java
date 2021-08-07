package beans;

public class PersonInfo {
	private String firstname,middlename,lastname;

	public PersonInfo(String firstname, String middlename, String lastname) {
		super();
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
	}

	public PersonInfo() {
		super();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	


}
