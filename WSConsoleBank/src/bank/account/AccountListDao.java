package bank.account;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AccountListDao implements AccountDao {

	List<Account> accountDB = new LinkedList<>();
	
	@Override
	public boolean save(Account a) {
		return accountDB.add(a);
	}

	@Override
	public List<Account> findAll() {
		if(accountDB.size() == 0) return null;
		List<Account> accounts = new ArrayList<>();
		for(Account a : accountDB) {
			accounts.add(a);
		}
		return accounts;
	}

	@Override
	public Account findById(String accountNo) {
		for (Account a : accountDB) {
			if (a.getAccountNo().equals(accountNo))
				return a;
		}
		return null;
	}

	// 회원 ID로 계좌 찾기
	@Override
	public List<Account> findByMemberId(String id) {
		List<Account> memberAccounts = new ArrayList<>();
		for (Account a : accountDB) {
			if (a.getId().equals(id)) {
				memberAccounts.add(a);
			}
		}
		
		// 해당하는 계좌가 없으면 null 반환 
		if(memberAccounts.size() == 0) return null; 
		
		return memberAccounts;
	}

	@Override
	public boolean update(Account a) {
		Account target = findById(a.getAccountNo());
		if (target == null) return false;
		accountDB.remove(target);
		accountDB.add(a);
		return true;
	}

	@Override
	public boolean delete(Account a) {
		Account target = findById(a.getAccountNo());
		if (target == null) return false;
		return accountDB.remove(target);
	}
	
}