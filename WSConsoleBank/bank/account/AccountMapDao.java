package bank.account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bank.member.Member;

public class AccountMapDao implements AccountDao{

	Map<Integer, Account> accountDB = new HashMap<Integer, Account>();
	@Override
	public boolean save(Account a) {
		accountDB.put(a.getNo(), a);
		return false;
	}

	@Override
	public List<Account> findAll() {
		if (!accountDB.isEmpty()) {
			List<Account> alist = new ArrayList<>();
			for(Account a : accountDB.values()) {
				alist.add(a);
			}
			return alist;
		}
		return null;
	}

	@Override
	public Account findById(String id) {
		for(Account a : accountDB.values()) {
			if(id==(a.getMemberId())) {
				return a;
			}
		}
		return null;
	}

	@Override
	public boolean update(Account a) {
		accountDB.put(a.getNo(), a);
		return false;
	}

	@Override
	public boolean delete(Account a) {
		accountDB.remove(a.getNo(), a);
		return true;
	}
	
}
