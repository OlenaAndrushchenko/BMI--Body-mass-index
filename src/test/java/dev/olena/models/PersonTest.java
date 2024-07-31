package dev.olena.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person(80.00, 1.70);
    }

    @Test
    void testPersonHas2Fields() {
        assertThat(person.getClass().getDeclaredFields().length, is(2));
    }

	@Test
	void testGetWeight() {
		assertThat(person.getWeight(), is(80.00));
	}

    @Test
    void testGetHeight() {
        assertThat(person.getHeight(), is(1.70));
    }

}
