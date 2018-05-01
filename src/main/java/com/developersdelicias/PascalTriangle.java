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
		return Level.levelOne();
	}

	public String triangleOfLevelTwo() {
		return Level.levelOne() + levelSeparator() + Level.levelTwo();
	}

	public String triangleOfLevelThree() {
		return Level.levelOne() + levelSeparator() + Level.levelTwo() + levelSeparator() + Level.levelThree();
	}

	private String levelSeparator() {
		return ", ";
	}
}
