package com.kneus.fitformoney.service;

import com.kneus.fitformoney.domain.Member;
import com.kneus.fitformoney.domain.MembershipType;
import com.kneus.fitformoney.domain.Measurement;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface MemberService {
    void addMember(Member member);

    Member getMember(Member memberId);

    List<Member> getAllMembers();


}
