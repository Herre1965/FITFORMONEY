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
    private final List<Member> list = new ArrayList<>();
    private final Calendar calendar = Calendar.getInstance();


    @Override
    public void addMember(Member member) {

    }

    @Override
    public Member getMember(Member MemberId) {
        return null;
    }

    @Override
    public Member getMemberByName(String name) {
         return list.stream()
                 .filter(Member -> Member.getName().equalsIgnoreCase(String.valueOf(name))).findFirst()
                 .orElse(null);
    }

    @Override
    public List<Member> getAllMembers() {
        // TODO: Hoe kunnen we datumformaat eejj-mm-dd gebruiken in de datumvelden (Leon)
        // TODO: Metingen toevoegen aan bestaand member (Herre)
        // TODO: Hoe bij meting BMI berekening toevoegen (Edwin)
        // TODO: Hoe excel toe te voegen (bestand inlezen en verwerken)
        calendar.set(1966, Calendar.DECEMBER, 28, 59, 59, 59);
        Member herre = new Member
                (UUID.randomUUID(), "Herre Scherpenzeel", calendar.getTime(), 186.00,
                        MembershipType.Silver, null);
        Member leon = new Member
                (UUID.randomUUID(), "Leon Zoet", ConvertString2Date("29-12-1966"), 186.00,
                        MembershipType.Wooden, null);

        list.add(herre);
        list.add(leon);

        Measurement edwinMeting1 = new Measurement
                (ConvertString2Date("15-03-2023"), 99.9, 28.87, 19.0,
                        null, null);

        Member edwin = new Member
                (UUID.randomUUID(), "Edwin Huijser", new Date(66, Calendar.DECEMBER, 29), 186.00,
                        MembershipType.Gold, Collections.singletonList(edwinMeting1));

        list.add(edwin);

        Test();
        return list;
    }

    public void addMeasurementByMember(UUID memberId, Date currentDate){
        //list.add(getMember(memberId));
    }
    public void Test(){
        Member test = getMemberByName("Leon Zoet");
        Measurement leonMeting1 = new Measurement
                (ConvertString2Date("15-02-2023"), 99.9, 28.87, 19.0,
                        null, null);
        addMeasurementByMember(test.getMemberId(), leonMeting1.getMeasurementDate());
        Measurement leonMeting2 = new Measurement
                (ConvertString2Date("15-01-2023"), 99.9,
                        null, 19.0,
                        null, null);
        addMeasurementByMember(test.getMemberId(), leonMeting2.getMeasurementDate());
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
