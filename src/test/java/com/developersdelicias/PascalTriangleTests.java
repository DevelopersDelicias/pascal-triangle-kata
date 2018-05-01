package com.developersdelicias;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PascalTriangleTests {

	private PascalTriangle pascalTriangle;

	@Before
	public void setUp() {
		pascalTriangle = new PascalTriangle();
	}

	@Test
	public void can_retrieve_triangle_level_1() {
		assertEquals(pascalTriangle.triangleOfLevelOne(), pascalTriangle.triangleOf(1));
	}

	@Test
	public void can_retrieve_triangle_level_2() {
		assertEquals(pascalTriangle.triangleOfLevelTwo(), pascalTriangle.triangleOf(2));
	}

	@Test
	public void can_retrieve_triangle_level_3() {
		assertEquals(pascalTriangle.triangleOfLevelThree(), pascalTriangle.triangleOf(3));
	}
}
