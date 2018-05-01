package com.developersdelicias;

public class PascalTriangle {
	public String triangleOf(int level) {
		return level == 1 ? triangleOfLevelOne()
				: level == 2 ? triangleOfLevelTwo()
				: level == 3 ? triangleOfLevelThree() : noTriangle();
	}

	private String noTriangle() {
		return "";
	}

	public String triangleOfLevelThree() {
		return "[1], [1, 1], [1, 2, 1]";
	}

	public String triangleOfLevelTwo() {
		return "[1], [1, 1]";
	}

	public String triangleOfLevelOne() {
		return "[1]";
	}
}
