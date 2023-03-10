package com.kneus.fitformoney.service;

import com.kneus.fitformoney.domain.Member;
import com.kneus.fitformoney.domain.MembershipType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class MemberServiceImpl implements MemberService {

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
        List<Member> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(1966, Calendar.DECEMBER, 28, 59, 59, 59);
        Member herre = new Member
                (UUID.randomUUID(), "Herre", calendar.getTime(), 186.00,
                        MembershipType.Silver, null);
        Member leon = new Member
                (UUID.randomUUID(), "Leon", new Date(66, 12, 29), 186.00,
                        MembershipType.Wooden, null);
        Member edwin = new Member
                (UUID.randomUUID(), "Edwin", new Date(66, 12, 29), 186.00,
                        MembershipType.Gold, null);

        list.add(herre);
        list.add(leon);
        list.add(edwin);
        return list;
    }
}
