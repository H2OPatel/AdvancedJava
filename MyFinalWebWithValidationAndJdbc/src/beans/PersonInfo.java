package beans;

public class PersonInfo {
	private String firstname;
	private String lastname;
	private String middlename;
	public PersonInfo(String firstname, String middlename, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.middlename = middlename;
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	
	

}
