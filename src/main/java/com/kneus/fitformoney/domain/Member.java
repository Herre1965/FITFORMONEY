package com.kneus.fitformoney.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Member {
    UUID MemberId;
    String Name;
    Date Birthdate;
    Double Length;
    MembershipType MembershipType;
    List<Measurement> Measurements;

    public Member(UUID memberId, String name, Date birthdate, Double length,
                  com.kneus.fitformoney.domain.MembershipType membershipType, List<Measurement> measurements) {
        MemberId = memberId;
        Name = name;
        Birthdate = birthdate;
        Length = length;
        MembershipType = membershipType;
        Measurements = measurements;
    }

    public UUID getMemberId() {
        return MemberId;
    }

    public void setMemberId(UUID memberId) {
        MemberId = memberId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date birthdate) {
        Birthdate = birthdate;
    }

    public Double getLength() {
        return Length;
    }

    public void setLength(Double length) {
        Length = length;
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
