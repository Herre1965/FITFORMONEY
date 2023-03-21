package com.kneus.fitformoney.service;

import com.kneus.fitformoney.domain.Member;

import java.util.List;

public interface MemberService {
    void addMember(Member member);

    Member getMember(Member memberId);

    Member getMemberByName(String name);

    List<Member> getAllMembers();


}
