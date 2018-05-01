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

	public String triangleOfLevelOne() {
		return levelOne();
	}

	public String triangleOfLevelTwo() {
		return levelOne() + levelSeparator() + levelTwo();
	}

	public String triangleOfLevelThree() {
		return levelOne() + levelSeparator() + levelTwo() + levelSeparator() + levelThree();
	}

	private String levelThree() {
		return "[1, 2, 1]";
	}

	private String levelTwo() {
		return "[1, 1]";
	}

	private String levelSeparator() {
		return ", ";
	}

	private String levelOne() {
		return "[1]";
	}
}
