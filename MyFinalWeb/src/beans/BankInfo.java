package beans;

public class BankInfo {
	
	private String bankname;
	private int accountnumber;
	private int ssn;
	public BankInfo(String bankname, int accountnumber, int ssn) {
		super();
		this.bankname = bankname;
		this.accountnumber = accountnumber;
		this.ssn = ssn;
	}
	public BankInfo() {
		super();
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	

}
