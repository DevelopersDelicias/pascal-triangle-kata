package com.developersdelicias;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class PascalTriangleTests {

	private PascalTriangle pascalTriangle;

	@Test
	public void can_retrieve_triangle_level_1() {
		pascalTriangle = new PascalTriangle(1);
		assertEquals(pascalTriangle.triangleOfLevelOne(), pascalTriangle.triangleOf(1));
	}

	@Test
	public void can_retrieve_triangle_level_2() {
		pascalTriangle = new PascalTriangle(2);
		assertEquals(pascalTriangle.triangleOfLevelTwo(), pascalTriangle.triangleOf(2));
	}

	@Test
	public void can_retrieve_triangle_level_3() {
		pascalTriangle = new PascalTriangle(3);
		assertEquals(pascalTriangle.triangleOfLevelThree(), pascalTriangle.triangleOf(3));
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
