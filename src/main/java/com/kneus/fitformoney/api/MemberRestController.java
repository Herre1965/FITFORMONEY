package com.kneus.fitformoney.api;

import com.kneus.fitformoney.domain.Member;
import com.kneus.fitformoney.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
// FIXME: getmember geeft lijst terug ipv string
// TODO: getmember geeft nog niks terug

@RestController
public class MemberRestController {

    private final MemberService memberService;

    public MemberRestController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members")
    public List<Member> getMembers(){
        return memberService.getAllMembers();
    }
}
