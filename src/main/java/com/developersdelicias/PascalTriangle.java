package com.developersdelicias;

public class PascalTriangle {

	private final Value valueOne = new Value(1);
	private final Value valueTwo = new Value(2);

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
		return startLevelIndicator() + valueOne + endLevelIndicator();
	}

	private String levelTwo() {
		return startLevelIndicator() + valueOne + valueSeparator() + valueOne + endLevelIndicator();
	}

	private String levelThree() {
		return startLevelIndicator() +
				valueOne + valueSeparator() + valueTwo + valueSeparator() + valueOne + endLevelIndicator();
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
