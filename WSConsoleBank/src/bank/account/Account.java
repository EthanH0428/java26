package bank.account;

public class Account {

	private String accountNo;
	private String memberId; 
	private String password;
	private int balance;
	
	public Account(String accountNo, String memberId, String password, int balance) {
		this.accountNo = accountNo;
		this.memberId = memberId;
		this.password = password;
		this.balance = balance;
	}
	
	public Account(String accountNo, String memberId, String password) {
		this(accountNo, memberId, password, 0);
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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

	// 입금
	public void deposit(int amount) {
		if (amount > 0) {
			this.balance += amount;
		}
	}
	
	// 출금
	public boolean withdraw(int amount) {
		if (amount > 0 && this.balance >= amount) {
			this.balance -= amount;
			return true;
		}
		return false;
	}
	
	// 비밀번호 확인
	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}

	@Override
	public String toString() {
		return "[" + accountNo + ", " + memberId + ", " + password + ", " + balance + "]";
	}
	
}