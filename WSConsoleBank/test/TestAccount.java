package test;

import java.util.*;

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
		adao.save(new Account(1, "1111", "aaa", 0));
		adao.save(new Account(2, "1111", "sana", 0));
		adao.save(new Account(3, "1111", "aaa", 0));
		
		System.out.println(">>> 전체 계좌 목록");
		List<Account> alist = adao.findAll();
		
		printAccountList(alist);
		
		System.out.println(">>> no로 계좌 조회");
		Account a = adao.findByNo(1);
		System.out.println(a);
		
		System.out.println(">>> Member id의 계좌 조회");
		printAccountList(adao.findByMember("aaa"));
		
		System.out.println(">>> 비밀번호 변경");
		a.setPassword("1234");
		adao.update(a);
		printAccountList(alist);
		
		System.out.println(">>> 계좌 삭제");
		adao.delete(adao.findByNo(2));
		printAccountList(adao.findAll());
	}
	
	public static void printAccountList(List<Account> alist) {
		for(Account a : alist) {
			System.out.println(a);
		}
	}
}