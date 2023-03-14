package com.kneus.fitformoney.service;

import com.kneus.fitformoney.domain.Measurement;
import com.kneus.fitformoney.domain.Member;
import com.kneus.fitformoney.domain.MembershipType;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class MemberServiceImpl implements MemberService {

    @Override
    public void addMember(Member member) {

    }

    @Override
    public Member getMember(Member MemberId) {
        return null;
    }

    @Override
    public List<Member> getAllMembers() {
        List<Member> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        // TODO: Hoe kunnen we datumformaat eejj-mm-dd gebruiken in de datumvelden (Leon)
        // TODO: Metingen toevoegen aan bestaand member (Herre)
        // TODO: Hoe bij meting BMI berekening toevoegen
        // TODO: Hoe excel toe te voegen
        calendar.set(1966, Calendar.DECEMBER, 28, 59, 59, 59);
        Member herre = new Member
                (UUID.randomUUID(), "Herre Scherpenzeel", calendar.getTime(), 186.00,
                        MembershipType.Silver, null);
        Member leon = new Member
                (UUID.randomUUID(), "Leon Zoet", ConvertString2Date("29-12-1966"), 186.00,
                        MembershipType.Wooden, null);

        list.add(herre);
        list.add(leon);

        List<Measurement> meting = new ArrayList<>();

        Measurement edwinMeting1 = new Measurement
                (ConvertString2Date("13-03-2023"), 99.9, 28.87, 19.0,
                        null, null);

        Member edwin = new Member
                (UUID.randomUUID(), "Edwin Huijser", new Date(66, 12, 29), 186.00,
                        MembershipType.Gold, Collections.singletonList(edwinMeting1));


        list.add(edwin);

        return list;

    }

    public Date ConvertString2Date(String strDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date newDate = null;
        try {
            newDate = dateFormat.parse(strDate);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return newDate;
    }
}
