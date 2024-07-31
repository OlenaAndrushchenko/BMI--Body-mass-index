package dev.olena.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BmiCalculatorTest {

    BmiCalculator calculator;
    Person person;

    @BeforeEach
    void setUp() {
        person = new Person(80, 1.70);
        calculator = new BmiCalculator(person);   
    }

    @Test
    void testBmiCalculatorHas2Fields() {
        assertThat(calculator.getClass().getDeclaredFields().length, is(2));
    }
    
    @Test
    void testGetPerson() {
        assertThat(calculator.getPerson(), is(equalTo(person)));
    }

    @Test
    void testGetBmi() {
        assertThat(calculator.getBmi(), is(equalTo(0.0)));
    }

    
}
