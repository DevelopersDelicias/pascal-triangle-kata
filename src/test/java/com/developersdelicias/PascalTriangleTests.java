package com.developersdelicias;

import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PascalTriangleTests {

	private static final int ANY_LEVEL = 2;

	@Test
	public void can_get_pascal_levels_for_level_one() {
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
	public void can_get_pascal_levels_for_level_two() {
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
	public void can_get_pascal_levels_for_level_three() {
		final PascalTriangle triangle = new PascalTriangle(3);

		assertThat(
				"Cannot get levels of Pascal Triangle of level 3",
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

	@Test
	public void can_get_pascal_levels_for_level_four() {
		final PascalTriangle triangle = new PascalTriangle(4);

		assertThat(
				"Cannot get levels of Pascal Triangle of level 4",
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

								),
								new Level(
										new Value(1),
										new Value(3),
										new Value(3),
										new Value(1)

								)
						)
				)
		);
	}

	@Test
	@Ignore("Not sure if I want to implement this logic like this")
	public void can_be_represented_as_a_list_of_levels_for_single_level() {
		PascalTriangle pascalTriangle = Mockito.spy(new PascalTriangle(ANY_LEVEL));

		Levels levels = new Levels(
				new Level(
						new Value(1),
						new Value(2),
						new Value(3),
						new Value(4)
				)
		);

		Mockito.doReturn(levels).when(pascalTriangle).levels();

		assertThat(
				"Cannot represent one single level Pascal Triangle as String",
				pascalTriangle.toString(),
				is("[1, 2, 3, 4]")
		);
	}
}
