package member;

public class MemberService {

    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // 회원 등록
    public Member register(Member member) {
        // 1. id 중복 체크
        Member existing = memberRepository.findById(member.getId()); // 저장소에서 조회

        if (existing != null) { // 이미 같은 id가 있으면
            throw new RuntimeException("이미 존재하는 회원입니다. id = " + member.getId());
        }

        // 2. 없으면 저장
        memberRepository.save(member);

        return member;
    }

    // 이메일로 회원 조회
    public Member findByEmail(String email) {
        Member member = memberRepository.findByEmail(email); // 저장소에서 조회

        if (member == null) { // 못 찾았으면
            throw new RuntimeException("존재하지 않는 이메일입니다. email = " + email);
        }

        return member;
    }
}