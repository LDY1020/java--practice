package member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long id);

    Member findByEmail(String email);
}
