package bank.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import bank.util.ConnectionFactory;
import bank.util.JDBCClose;

public class MemberOracleDao implements MemberDao{

	@Override
	public boolean save(Member m) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			String sql = "insert into j_member(id, password, name, email, mobile, type)";
				   sql += " values (?, ?, ?, ?, ?, ?)";
				   
		    pstmt = conn.prepareStatement(sql);
		    int loc = 1;
		    pstmt.setString(loc++, m.getId());
		    pstmt.setString(loc++, m.getPassword());
		    pstmt.setString(loc++, m.getName());
		    pstmt.setString(loc++, m.getEmail());
		    pstmt.setString(loc++, m.getMobile());
		    pstmt.setString(loc++, String.valueOf(m.getType()));
		    pstmt.executeUpdate();
		    return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}

	@Override
	public List<Member> findAll() {
		List<Member> memberList = new ArrayList<Member>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			String sql = "select id, password, name, email, mobile, type";
			       sql += " from j_member";
			
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String password = rs.getString("password");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String mobile = rs.getString("mobile");
				char type = rs.getString("type").charAt(0);
				
				Member member = new Member(id, password, name, email, mobile, type);
				member.setId(id);
				member.setPassword(password);
				member.getName();
				member.getEmail();
				member.getMobile();
				member.getType();
				
				memberList.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		return memberList;
	}
	
	@Override
	public Member findById(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			String sql = "select id, password, name, email, mobile, type";
				   sql += " from j_member";
				   sql += " where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				Member member = new Member(null, null, null, null, null, ' ');
				member.setId(rs.getString("id"));
				member.setPassword(rs.getString("password"));
				member.setName(rs.getString("name"));
				member.setEmail(rs.getString("email"));
				member.setMobile(rs.getString("mobile"));
				member.setType(rs.getString("type").charAt(0));
				
				return member;
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		return null;
	}

	@Override
	public boolean update(Member m) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			Member target = findById(m.getId());
			if(target == null) return false;
			
			String 	sql = "update j_member";
					sql += " set id = ?,";
					sql += "    password = ?,";
					sql += "    name = ?,";
					sql += "    email = ?,";
					sql += "    mobile = ?,";
					sql += "    type = ?";
					sql += " where id = ?";
			pstmt = conn.prepareStatement(sql);
			int loc = 1;
			pstmt.setString(loc++, m.getId());
			pstmt.setString(loc++, m.getPassword());
			pstmt.setString(loc++, m.getName());
			pstmt.setString(loc++, m.getEmail());
			pstmt.setString(loc++, m.getMobile());
			pstmt.setString(loc++, String.valueOf(m.getType()));
			pstmt.setString(loc++, target.getId());
			pstmt.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		return false;
	}

	@Override
	public boolean delete(Member m) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			String sql = "delete from j_member";
				   sql += " where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.executeUpdate();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		return false;
	}
}