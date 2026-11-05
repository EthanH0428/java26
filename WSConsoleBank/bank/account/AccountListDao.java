package bank.account;

import java.util.ArrayList;
import java.util.List;

public class AccountListDao implements AccountDao{

	List<Account> accountDB = new ArrayList<>();
	
	@Override
	public boolean save(Account a) {
		return accountDB.add(a);
	}

	@Override
	public List<Account> findAll() {
		if(accountDB.size() == 0) return null;
		
		List<Account> accounts = new ArrayList<>();
		for (Account a : accountDB) {
			accounts.add(a);
		}
		return accounts;
	}

	@Override
	public Account findByNo(int no) {
		for (Account a : accountDB) {
			if(a.getNo() == no) {
				return a;
			}
		}
		return null;
	}

	@Override
	public List<Account> findByMember(String id) {
		List<Account> findAccList = new ArrayList<>();
		for(Account a : accountDB) {
			if(a.getMemberId().equals(id)) {
				findAccList.add(a);
			}
		}
		return findAccList;
	}
	
	@Override
	public boolean update(Account a) {
		Account target = findByNo(a.getNo());
		if(target == null) return false;
		accountDB.remove(target);
		accountDB.add(a);
		return true;
	}


	@Override
	public boolean delete(Account a) {
		Account target = findByNo(a.getNo());
		if(target == null) return false;
		accountDB.remove(a);
		return true;
	}

	
}