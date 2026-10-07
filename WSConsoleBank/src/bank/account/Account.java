package bank.account;

public class Account {

	private String accountNo;
	private String id;       // 계좌 소유주 ID
	private String password;
	private int balance;     // 잔액 (amount)
	
	public Account(String accountNo, String id, String password, int balance) {
		this.accountNo = accountNo;
		this.id = id;
		this.password = password;
		this.balance = balance;
	}
	
	public Account(String accountNo, String id, String password) {
		this(accountNo, id, password, 0);
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "[" + accountNo + ", " + id + ", " + password + ", " + balance + "]";
	}
	
}