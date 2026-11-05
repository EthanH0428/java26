package bank.app;

import bank.account.AccountListDao;
import bank.account.AccountService;
import bank.account.WSAccountService;
import bank.app.menu.StartMenu;
import bank.member.WSMemberService;
import bank.member.MemberListDao;
import bank.member.MemberService;

public class WSConsoleBankApp {

	public static void main(String[] args) {
		MemberService ms = new WSMemberService(new MemberListDao());
		AccountService as = new WSAccountService(new AccountListDao());
		
		new StartMenu(as, ms).run();
	}
}
