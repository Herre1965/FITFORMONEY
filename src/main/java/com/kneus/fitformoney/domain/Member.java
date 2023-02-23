package com.kneus.fitformoney.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;
// TODO: Camelcasing toepassen
public class Member {
    private UUID memberId;
    private String name;
    private Date birthdate;
    private Double length;
    private MembershipType MembershipType;
    private List<Measurement> Measurements;

    public Member(UUID memberId, String name, Date birthdate, Double length,
                  com.kneus.fitformoney.domain.MembershipType membershipType, List<Measurement> measurements) {
        this.memberId = memberId;
        this.name = name;
        this.birthdate = birthdate;
        this.length = length;
        MembershipType = membershipType;
        Measurements = measurements;
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public com.kneus.fitformoney.domain.MembershipType getMembershipType() {
        return MembershipType;
    }

    public void setMembershipType(com.kneus.fitformoney.domain.MembershipType membershipType) {
        MembershipType = membershipType;
    }

    public List<Measurement> getMeasurements() {
        return Measurements;
    }

    public void setMeasurements(List<Measurement> measurements) {
        Measurements = measurements;
    }
}
