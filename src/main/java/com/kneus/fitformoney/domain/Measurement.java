package com.kneus.fitformoney.domain;

import java.util.Date;

// TODO: 1 camelcasing toepassen
// TODO: 2 this. toevoegen aan de variabelen
// TODO: 3 private maken variabelen
public class Measurement {
    Date currentDate;
    Double Weight;
    Double BMI;
    Double FatPercentage;
    Double LeanBodyMass;
    Double FatMass;
    public Measurement(Date currentDate, Double weight, Double BMI, Double fatPercentage,
                       Double leanBodyMass, Double fatMass) {
        this.currentDate = currentDate;
        Weight = weight;
        this.BMI = BMI;
        FatPercentage = fatPercentage;
        LeanBodyMass = leanBodyMass;
        FatMass = fatMass;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double weight) {
        Weight = weight;
    }

    public Double getBMI() {
        return BMI;
    }

    public void setBMI(Double BMI) {
        this.BMI = BMI;
    }

    public Double getFatPercentage() {
        return FatPercentage;
    }

    public void setFatPercentage(Double fatPercentage) {
        FatPercentage = fatPercentage;
    }

    public Double getLeanBodyMass() {
        return LeanBodyMass;
    }

    public void setLeanBodyMass(Double leanBodyMass) {
        LeanBodyMass = leanBodyMass;
    }

    public Double getFatMass() {
        return FatMass;
    }

    public void setFatMass(Double fatMass) {
        FatMass = fatMass;
    }
}
