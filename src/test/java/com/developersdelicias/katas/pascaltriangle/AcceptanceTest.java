package com.developersdelicias.katas.pascaltriangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

import org.junit.Before;
import org.junit.Test;

public class AcceptanceTest {

	private Output output;
	private PascalTriangleFormat format;

	@Before
	public void setUp() {
		output = mock(Console.class);
	}

	@Test
	public void can_print_pascal_triangle_of_level_one_in_console() {
		format = new BranchedPascalTriangleFormat();

		printPascalTriangleOfLevel(1);

		verify(output).print("1");
	}

	@Test
	public void can_print_pascal_triangle_of_level_two_in_console() {
		format = new BranchedPascalTriangleFormat();

		printPascalTriangleOfLevel(2);

		verify(output).print(
			triangle(
				"  1" ,
				" / \\" ,
				"1   1"
			)
		);
	}

	@Test
	public void can_print_pascal_triangle_of_level_six_in_console() {
		format = new BranchedPascalTriangleFormat();

		printPascalTriangleOfLevel(6);

		verify(output).print(
			triangle(
				"          1" ,
				"         / \\" ,
				"        1   1" ,
				"       / \\ / \\" ,
				"      1   2   1" ,
				"     / \\ / \\ / \\" ,
				"    1   3   3   1" ,
				"   / \\ / \\ / \\ / \\" ,
				"  1   4   6   4   1" ,
				" / \\ / \\ / \\ / \\ / \\" ,
				"1   5  10  10   5   1"
			)
		);
	}

	@Test
	public void triangle_of_11() throws Exception{
		format = new BranchedPascalTriangleFormat();

		printPascalTriangleOfLevel(11);

		String expectedTriangle = fromFile("src/test/resources/pascal_triangle_level_11.txt");


		verify(output).print(expectedTriangle);
	}

	@Test
	public void triangle_of_14() throws Exception {
		format = new BranchedPascalTriangleFormat();

		printPascalTriangleOfLevel(14);

		String expectedTriangle = fromFile("src/test/resources/pascal_triangle_level_14.txt");

		verify(output).print(expectedTriangle);
	}

	@Test
	public void triangle_of_17() throws Exception {
		format = new BranchedPascalTriangleFormat();

		printPascalTriangleOfLevel(17);

		String expectedTriangle = fromFile("src/test/resources/pascal_triangle_level_17.txt");

		verify(output).print(expectedTriangle);
	}

	@Test
	public void triangle_of_19() throws Exception {
		format = new BranchedPascalTriangleFormat();

		printPascalTriangleOfLevel(19);

		String expectedTriangle = fromFile("src/test/resources/pascal_triangle_level_19.txt");

		verify(output).print(expectedTriangle);
	}

	@Test
	public void can_print_in_single_format() {
		format = new SinglePascalTriangleFormat();

		printPascalTriangleOfLevel(5);

		String expected = triangle(
			"1" ,
			"1 1" ,
			"1 2 1" ,
			"1 3 3 1" ,
			"1 4 6 4 1"
		);
		verify(output).print(expected);
	}

	@Test
	public void can_be_stored_in_a_file() throws IOException {
		String fileToCreate = "src/test/triangle.text";
		format = new SinglePascalTriangleFormat();
		output = new ToFile(fileToCreate);

		printPascalTriangleOfLevel(5);

		File file = new File(fileToCreate);
		assertTrue(file.exists());
		String expected = triangle(
			"1" ,
			"1 1" ,
			"1 2 1" ,
			"1 3 3 1" ,
			"1 4 6 4 1"
		);
		assertThat(textOf(file), is(expected));
		assertTrue(file.delete());
	}

	private String textOf(File file) throws IOException {
		return new String(Files.readAllBytes(file.toPath()), Charset.defaultCharset());
	}

	private void printPascalTriangleOfLevel(final int level) {
		new PascalTriangle(level).print(output, format);
	}

	private String triangle(String...lines) {
		return String.join("\n", lines);
	}

	private String fromFile(String path) throws IOException {
		return textOf(new File(path));
	}
}
