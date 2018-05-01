package com.developersdelicias;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class ValueTest {

	@Test
	public void can_hold_a_number_and_convert_to_string() {
		Number number = 1;
		assertThat(
				"Cannot hold its number and convert to String",
				new Value(number).toString(),
				is("1")
		);
	}

	@Test
	public void value_with_same_number_are_equals() {
		Value firstValue = new Value(150);
		Value secondValue = new Value(150);

		assertThat(
				"Cannot determine when two values are equal",
				firstValue,
				is(secondValue)
		);
	}

	@Test
	public void values_with_different_number_are_not_equals() {
		Value firstValue = new Value(150);
		Value secondValue = new Value(200);

		assertThat(
				"Cannot determine when two values are not equal",
				firstValue,
				is(not(secondValue))
		);
	}

	@Test
	public void can_obtain_the_value_number() {
		Number expected = 140;
		assertThat(
				"Cannot obtain the value number",
				new Value(140).value(),
				is(expected)
		);
	}
}