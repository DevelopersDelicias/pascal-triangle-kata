package com.developersdelicias;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PascalTriangleTests {

	@Test
	public void is_a_collection_of_levels_level_one() {
		final PascalTriangle triangle = new PascalTriangle(1);

		assertThat(
				"Cannot get levels of Pascal Triangle of level 1",
				triangle.levels(),
				is(new Levels(
								new Level(
										new Value(1)
								)
						)
				)
		);
	}

	@Test
	public void is_a_collection_of_levels_level_two() {
		final PascalTriangle triangle = new PascalTriangle(2);

		assertThat(
				"Cannot get levels of Pascal Triangle of level 2",
				triangle.levels(),
				is(new Levels(
								new Level(
										new Value(1)
								),
								new Level(
										new Value(1),
										new Value(1)
								)
						)
				)
		);
	}

	@Test
	public void is_a_collection_of_levels() {
		final PascalTriangle triangle = new PascalTriangle(3);

		assertThat(
				"Is not a collection of Levels",
				triangle.levels(),
				is(new Levels(
								new Level(
										new Value(1)
								),
								new Level(
										new Value(1),
										new Value(1)
								),
								new Level(
										new Value(1),
										new Value(2),
										new Value(1)

								)
						)
				)
		);
	}
}
