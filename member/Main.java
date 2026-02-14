package member;

public class Main {

    public static void main(String[] args) {
        MemberService memberService = new MemberService(new MemoryMemberRepository());

        memberService.register(new Member(1L , "도윤" , "jkjk9481@naver.com"));
        memberService.register(new Member(2L , "철수" , "jkjk7180@naver.com"));
        memberService.register(new Member(3L , "유리" , "jkjk5938@naver.com"));

        System.out.println("===이메일로 회원 찾기===");
        Member findEmail = memberService.findByEmail("jkjk9481@naver.com");
        System.out.println(findEmail.getName()); // -> "도윤"

        // 없는 이메일 테스트
        Member findEmail2 = memberService.findByEmail("dlawpldas"); // 여기서 예외 터짐
    }
}
