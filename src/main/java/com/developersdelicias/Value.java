package com.developersdelicias;

public class Value {
	private final Number number;

	public Value(Number number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return number.toString();
	}
}
