package bank.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberMapDao implements MemberDao{

	
	Map<String, Member> memberDB = new HashMap<String, Member>();
	
	@Override
	public boolean save(Member m) {
		memberDB.put(m.getId(), m);
		return false;
	}

	@Override
	public List<Member> findAll() {
		
		if (! memberDB.isEmpty()) {
			List<Member> mlist = new ArrayList<>();
			for (Member m : memberDB.values()) {
				mlist.add(m);
			}
			return mlist;
		}
		return null;
		
	}

	@Override
	public Member findById(String id) {
		return memberDB.get(id);
	}

	@Override
	public boolean update(Member m) {
		memberDB.put(m.getId(), m);
		return true;
		//return save(m);-이미 위에 세이브랑 형식 같으니까 요렇게 가능
	}

	@Override
	public boolean delete(Member m) {
		memberDB.remove(m.getId());
		return true;
	}

}
