package com.developersdelicias;

public class Level {
	private final Values values;

	public Level(Value... values) {
		this.values = new Values(values);
	}

	static String levelOne() {
		return startLevelIndicator() + new Value(1) + endLevelIndicator();
	}

	static String levelTwo() {
		return startLevelIndicator() + new Value(1) + valueSeparator() + new Value(1) + endLevelIndicator();
	}

	static String levelThree() {
		return startLevelIndicator() +
				new Value(1) + valueSeparator() + new Value(2) + valueSeparator() + new Value(1) + endLevelIndicator();
	}

	private static String startLevelIndicator() {
		return "[";
	}

	private static String endLevelIndicator() {
		return "]";
	}

	private static String valueSeparator() {
		return ", ";
	}

	public Values values() {
		return this.values;
	}
}
