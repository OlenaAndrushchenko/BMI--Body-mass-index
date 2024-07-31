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
}
