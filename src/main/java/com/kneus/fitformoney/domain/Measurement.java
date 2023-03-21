package com.kneus.fitformoney.domain;

import java.util.Date;

public class Measurement {
    private Date measurementDate;
    private Double weight;
    private Double BMI;
    private Double fatPercentage;
    private Double leanBodyMass;
    private Double fatMass;
    public Measurement(Date currentDate, Double weight, Double BMI, Double fatPercentage,
                       Double leanBodyMass, Double fatMass) {
        this.measurementDate = currentDate;
        this.weight = weight;
        this.BMI = BMI;
        this.fatPercentage = fatPercentage;
        this.leanBodyMass = leanBodyMass;
        this.fatMass = fatMass;
    }

    public Date getMeasurementDate() {
        return measurementDate;
    }

    public void setMeasurementDate(Date measurementDate) {
        this.measurementDate = measurementDate;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getBMI() {
        return BMI;
    }

    public void setBMI(Double BMI) {
        this.BMI = BMI;
    }

    public Double getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(Double fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    public Double getLeanBodyMass() {
        return leanBodyMass;
    }

    public void setLeanBodyMass(Double leanBodyMass) {
        this.leanBodyMass = leanBodyMass;
    }

    public Double getFatMass() {
        return fatMass;
    }

    public void setFatMass(Double fatMass) {
        this.fatMass = fatMass;
    }
}
