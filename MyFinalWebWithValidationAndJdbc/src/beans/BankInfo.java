package beans;

public class BankInfo {
	
	private String bankname;
	private Long accountnumber;
	private Long ssn;
	public BankInfo(String bankname, Long accountnumber, Long ssn) {
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
	public Long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(Long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public Long getSsn() {
		return ssn;
	}
	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}
	
	


}
