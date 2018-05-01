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
}