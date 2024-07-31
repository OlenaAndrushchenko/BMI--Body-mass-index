package dev.olena.models;

public enum BmiCategory {
    SEVERE_THINNESS("Severe Thinness"),
    MODERATE_THINNESS("Moderate Thinness"),
    MID_THINNESS("Mid Thinness"),
    NORMAL("Normal"),
    OVERWEIGHT("Overweight"),
    OBESE_CLASS_1("Obese Class 1"),
    OBESE_CLASS_2("Obese Class 2"),
    OBESE_CLASS_3("Obese Class 3");

    private final String description;

    BmiCategory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}