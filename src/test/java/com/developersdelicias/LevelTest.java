package com.developersdelicias;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LevelTest {

	@Test
	public void level_is_a_collection_of_values() {
		Level levelWithOneValue = new Level(
				new Value(1), new Value(2), new Value(3)
		);

		assertThat(
				"A level is not a collection of values",
				levelWithOneValue.values(),
				is(new Values(
						new Value(1), new Value(2), new Value(3)
				))
		);
	}

	@Test
	public void can_be_represented_as_string() {
		Level aLevel = new Level(
				new Value(100),
				new Value(154),
				new Value(45)
		);

		assertThat(
				"Cannot be represented as a String",
				aLevel.toString(),
				is("[100, 154, 45]")
		);
	}

	@Test
	public void can_access_to_specific_value_in_the_level_values() {
		Level aLevel = new Level(
				new Value(96),
				new Value(85),
				new Value(6)
		);

		assertThat(
				"Cannot access to specific value on the level",
				aLevel.valueAt(1),
				is(new Value(85))
		);
	}

	@Test
	public void negative_indexes_return_value_as_zero() {
		Level aLevel = new Level(
				new Value(38),
				new Value(12),
				new Value(26)
		);

		assertThat(
				"A value of zero is expected using negative indexes",
				aLevel.valueAt(-1),
				is(new Value(0))
		);
	}

	@Test
	public void out_of_bound_indexes_returns_value_of_zero() {
		Level aLevel = new Level(
				new Value(38),
				new Value(12),
				new Value(26)
		);

		assertThat(
				"A value of zero is expected using out of bound indexes",
				aLevel.valueAt(3),
				is(new Value(0))
		);
	}
}