package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        Member m1 = new Member(1L, "kim", Grade.VIP);
        memberService.join(m1);

        Member findMember = memberService.findMember(1L);

        Assertions.assertThat(m1).isEqualTo(findMember);
    }
}
