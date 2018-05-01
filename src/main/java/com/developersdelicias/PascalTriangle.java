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

	private String levelOne() {
		return startLevelIndicator() + Value.valueOne() + endLevelIndicator();
	}

	private String levelTwo() {
		return startLevelIndicator() + Value.valueOne() + valueSeparator() + Value.valueOne() + endLevelIndicator();
	}

	private String levelThree() {
		return startLevelIndicator() +
				Value.valueOne() + valueSeparator() + Value.valueTwo() + valueSeparator() + Value.valueOne() + endLevelIndicator();
	}

	private String startLevelIndicator() {
		return "[";
	}

	private String endLevelIndicator() {
		return "]";
	}

	private String levelSeparator() {
		return ", ";
	}

	private String valueSeparator() {
		return ", ";
	}
}
