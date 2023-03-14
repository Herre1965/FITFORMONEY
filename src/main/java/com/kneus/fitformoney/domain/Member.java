package com.kneus.fitformoney.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;
// TODO: Camelcasing toepassen
public class Member {
    private UUID memberId;
    private String name;
    private Date birthDate;
    private Double length;
    private MembershipType memberShipType;
    private List<Measurement> measurements;

    public Member(UUID memberId, String name, Date birthdate, Double length,
                  com.kneus.fitformoney.domain.MembershipType memberShipType, List<Measurement> measurements) {
        this.memberId = memberId;
        this.name = name;
        this.birthDate = birthdate;
        this.length = length;
        this.memberShipType = memberShipType;
        this.measurements = measurements;
    }

    public Member (String name){
        this.name = name;
    }

    public UUID getMemberId() {
        return memberId;
    }

    public void setMemberId(UUID memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public com.kneus.fitformoney.domain.MembershipType getMemberShipType() {
        return memberShipType;
    }

    public void setMemberShipType(com.kneus.fitformoney.domain.MembershipType memberShipType) {
        this.memberShipType = memberShipType;
    }

    public List<Measurement> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<Measurement> measurements) {
        this.measurements = measurements;
    }
}
