package com.kneus.fitformoney.service;

import com.kneus.fitformoney.domain.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{

    @Override
    public void addMember(Member member) {

    }

    @Override
    public Member getMember(Member MemberId) {
        return null;
    }

    //TODO: string constructor Member lite verwijderen (full gebruiken!)
    @Override
    public List<Member> getAllMembers() {
        List<Member> list=new ArrayList<>();
        Member herre = new Member("Herre");
        Member leon = new Member("Leon");
        Member edwin = new Member("Edwin");

        list.add(herre);
        list.add(leon);
        list.add(edwin);
        return list;
    }
}
