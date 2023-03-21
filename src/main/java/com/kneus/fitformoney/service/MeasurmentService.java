package com.kneus.fitformoney.service;

import com.kneus.fitformoney.domain.Measurement;
import com.kneus.fitformoney.domain.Member;

import java.util.Date;

public interface MeasurmentService {
    default void addMeasurement(Member memberId, Date currentDate) {

    }

    public default double calculateBMI(Double length, double weight) {
        length /= 100;
        double divisor = (length * length);

        return weight / divisor;
    }
}
