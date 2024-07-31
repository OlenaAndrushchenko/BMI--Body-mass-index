package dev.olena.models;


public class BmiCalculator {
    
    private Person person;
    private double bmi;

    public BmiCalculator(Person person) {
        this.person = person;
    }
    
    public Person getPerson() {
        return person;
    }
    
    public double getBmi() {
        return bmi;
    }

    public void calculate() {
        bmi = Math.rint((person.getWeight() / Math.pow(person.getHeight(), 2))*100)/100;
    }

    public BmiCategory getBmiCategory() {

        if (bmi < 16) {
            return BmiCategory.SEVERE_THINNESS;
        } else if (bmi >= 16 && bmi < 17) {
            return BmiCategory.MODERATE_THINNESS;
        } else if (bmi >= 17 && bmi < 18.5) {
            return BmiCategory.MID_THINNESS;
        } else if (bmi >= 18.5 && bmi < 25) {
            return BmiCategory.NORMAL;
        } else if (bmi >= 25 && bmi < 30) {
            return BmiCategory.OVERWEIGHT;
        } else if (bmi >= 30 && bmi < 35) {
            return BmiCategory.OBESE_CLASS_1;
        } else if (bmi >= 35 && bmi < 40) {
            return BmiCategory.OBESE_CLASS_2;
        } else {
            return BmiCategory.OBESE_CLASS_3;
        }
    }
}
