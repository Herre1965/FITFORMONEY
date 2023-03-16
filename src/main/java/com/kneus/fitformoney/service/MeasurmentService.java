package com.kneus.fitformoney.service;

import com.kneus.fitformoney.domain.Measurement;
import com.kneus.fitformoney.domain.Member;

import java.util.Date;

public interface MeasurmentService {
    default void addMeasurement(Member memberId, Date currentDate) {

    }

    default double calculateBMI(Double length, double weight) {
        weight /= 100;
        double divisor = (weight * weight);

        return length / divisor;
    }
}
