package test;

import java.util.List;

import bank.member.Member;
import bank.member.MemberDao;
import bank.member.MemberListDao;
import bank.member.MemberOracleDao;
import bank.member.MemberService;
import bank.member.YJMemberService;

public class TestMember {
	public static void main(String[] args) {
//		testMemberDao();
		testMemberService();
//		testMemberOracleDao();
	}
	
	public static void testMemberService() {
//		MemberService ms = new YJMemberService(new MemberListDao());
		MemberService ms = new YJMemberService(new MemberOracleDao());
		
		System.out.println(">> 회원가입 및 목록조회");
		ms.join("usik", "1111", "우식");
		ms.join("usik", "1111", "우식");
		ms.join("usik2", "1111", "우식");
		
		printMemberList(ms.getAllMembers());
		
		System.out.println(">> 로그인, 로그아웃");
		if(ms.login("usik", "1111"))
			System.out.println(ms.getLoggedMember());
		ms.logout();
		System.out.println(ms.getLoggedMember());
		
		System.out.println(">> 회원정보 보기");
		ms.login("usik", "1111");
		System.out.println(ms.getMemberInfo("usik2"));
		System.out.println(ms.getMemberInfo("usik"));
		
		System.out.println(">> 비밀번호 변경");
		ms.changePassword("usik", "1111", "3333");
		printMemberList(ms.getAllMembers());
		
	}
	
	public static void testMemberDao() {
		MemberDao mdao = new MemberListDao();
		// 회원 추가
		
		System.out.println(">>> 회원 추가");
		mdao.save(new Member("admin", "1234", "admin", null, null, Member.ADMIN));
		mdao.save(new Member("aaa", "1111", "유징징", null, null, Member.USER));
		mdao.save(new Member("ethan", "1111", "미용미용", null, null, Member.USER));
		// 회원 모두 조회
		System.out.println(">>> 회원 목록");
		List<Member> mlist = mdao.findAll();
		// 회원 출력
		printMemberList(mlist);
		// id로 회원 조회
		System.out.println(">>> id로 회원 조회");
		Member m = mdao.findById("ethan");
		System.out.println(m);
		
		System.out.println(">>> 비밀번호 변경");
		m.setPassword("1234");
		mdao.update(m);
		printMemberList(mdao.findAll());

		System.out.println(">>> 회원 삭제");
		mdao.delete(mdao.findById("ethan"));
		printMemberList(mdao.findAll());
	}
	
	public static void testMemberOracleDao() {
		MemberDao mdao = new MemberOracleDao();
		
		System.out.println("> 회원추가");
		mdao.save(new Member("aaa", "1111", "회원A", null, null, Member.USER));
		mdao.save(new Member("bbb", "1111", "회원B", null, null, Member.USER));
		mdao.save(new Member("ccc", "1111", "회원C", null, null, Member.USER));
		
		System.out.println("> 회원목록");
		List<Member> members = mdao.findAll();
		printMemberList(members);
		
		System.out.println("> id로 회원 조회");
		Member member = mdao.findById("aaa");
		System.out.println(member);
		
		System.out.println("> 비밀번호 변경");
		member.setPassword("1234");
		mdao.update(member);
		printMemberList(mdao.findAll());
		
		System.out.println("> 회원 삭제");
		mdao.delete(mdao.findById("bbb"));
		printMemberList(mdao.findAll());
		
	}
	
	public static void printMemberList(List<Member> mlist) {
		for(Member m : mlist) {
			System.out.println(m);
		}
	}
}
