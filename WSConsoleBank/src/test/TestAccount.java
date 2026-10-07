package test;

import java.util.List;

import bank.account.Account;
import bank.account.AccountDao;
import bank.account.AccountListDao;

public class TestAccount {
	public static void main(String[] args) {
		testAccountDao();
	}
	
	public static void testAccountDao() {
		AccountDao adao = new AccountListDao();
		
		// 계좌 추가
		System.out.println(">>> 계좌 추가 및 계좌 목록");
		adao.save(new Account("111-111", "woosik", "1111", 10000));
		adao.save(new Account("222-222", "curi", "1111", 50000));
		adao.save(new Account("333-333", "woosik", "1234", 20000)); 
		printAccountList(adao.findAll());
		
		System.out.println(">>> 계좌번호로 계좌 찾기");
		Account a = adao.findById("222-222");
		System.out.println(a);
		
		System.out.println(">>> 회원 ID('woosik')로 계좌 찾기");
		List<Account> woosikAccounts = adao.findByMemberId("woosik");
		if(woosikAccounts != null) {
			printAccountList(woosikAccounts);
		} else {
			System.out.println("해당 ID의 계좌가 없습니다.");
		}
		
		System.out.println(">>> 비밀번호 및 잔액 변경");
		a.setPassword("1234");
		a.setBalance(30000);
		adao.update(a);
		printAccountList(adao.findAll());
		
		System.out.println(">>> 계좌 삭제");
		a = adao.findById("222-222");
		adao.delete(adao.findById("222-222"));
		
		printAccountList(adao.findAll());
	}
	
	public static void printAccountList(List<Account> alist) {
		for (Account a : alist) {
			System.out.println(a);
		}
	}
}