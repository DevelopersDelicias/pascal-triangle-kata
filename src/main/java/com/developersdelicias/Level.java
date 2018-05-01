package com.developersdelicias;

public class Level {
	private final Values values;

	Level(Value... values) {
		this.values = new Values(values);
	}

	static String levelOne() {
		Level levelOne = new Level(
				new Value(1)
		);
		return levelOne.toString();
	}

	static String levelTwo() {
		Level levelTwo = new Level(
				new Value(1),
				new Value(1)
		);
		return levelTwo.toString();
	}

	static String levelThree() {
		Level levelThree = new Level(
				new Value(1),
				new Value(2),
				new Value(3)
		);
		return levelThree.toString();
	}

	public Values values() {
		return this.values;
	}

	@Override
	public String toString() {
		return String.format("[%s]", values);
	}
}
