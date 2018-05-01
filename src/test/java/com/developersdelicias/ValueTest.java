package com.developersdelicias;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ValueTest {

	@Test
	public void can_hold_a_number_and_inform_its_value() {
		Number number = 1;
		assertThat(
				new Value(number).toString(),
				is("1")
		);
	}
}