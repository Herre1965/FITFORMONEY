package com.kneus.fitformoney.api;

import com.kneus.fitformoney.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// FIXME: getmember geeft lijst terug ipv string
// TODO: getmember geeft nog niks terug

@RestController
public class MemberRestController {

    private final MemberService memberService;

    public MemberRestController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/member")
    public String getMember(){
        return memberService.getAllMembers();
    }
}
