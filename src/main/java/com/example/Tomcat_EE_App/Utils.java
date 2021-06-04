package com.example.Tomcat_EE_App;

public class Utils {

    public static double calculateCompoundInterest(double principleAmount, double interestPercentage, int years, int compoundingPeriod) {

        return Math.round(principleAmount * Math.pow((1 + (interestPercentage / compoundingPeriod)), (compoundingPeriod * years)));

    }
}
