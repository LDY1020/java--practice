package member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private final Map<Long , Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long id) {
        return store.get(id);
    }

    @Override
    public Member findByEmail(String email) {
        for(Member m : store.values()) {
            if(m.getEmail().equals(email)) {
                return m;
            }
        }
        return null;
    }
}
