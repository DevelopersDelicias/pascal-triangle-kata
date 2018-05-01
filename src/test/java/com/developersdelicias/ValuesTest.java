package com.developersdelicias;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ValuesTest {

	@Test
	public void can_represent_a_single_element_as_string() {
		Values valuesWithJustOneElement = new Values(new Value(6));

		assertThat(
				"Cannot represent one single value as String",
				valuesWithJustOneElement.toString(),
				is("6")
		);
	}

	@Test
	public void can_represent_two_elements_list_as_string() {
		Values valuesWithTwoElements = new Values(
				new Value(9),
				new Value(5)
		);

		assertThat(
				"Cannot represent two elements values as String",
				valuesWithTwoElements.toString(),
				is("9, 5")
		);
	}

	@Test
	public void can_represent_three_elements_list_as_string() {
		Values valuesWithThreeElements = new Values(
				new Value(10),
				new Value(45),
				new Value(8)
		);

		assertThat(
				"Cannot represent three elements values as String",
				valuesWithThreeElements.toString(),
				is("10, 45, 8")
		);
	}

	@Test
	public void can_represent_any_list_more_than_three_elements_as_string() {
		Values valuesWithMoreThanThreeElements= new Values(
				new Value(85),
				new Value(14),
				new Value(63),
				new Value(69),
				new Value(145),
				new Value(7)
		);

		assertThat(
				"Cannot represent more than three elements values as String",
				valuesWithMoreThanThreeElements.toString(),
				is("85, 14, 63, 69, 145, 7")
		);
	}
}