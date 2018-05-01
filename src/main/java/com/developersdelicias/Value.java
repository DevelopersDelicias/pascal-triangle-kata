package com.developersdelicias;

public class Value {
	private final Number number;

	public Value(Number number) {
		this.number = number;
	}

	public static String valueOne() {
		return "1";
	}

	public static String valueTwo() {
		return "2";
	}

	@Override
	public String toString() {
		return number.toString();
	}
}
