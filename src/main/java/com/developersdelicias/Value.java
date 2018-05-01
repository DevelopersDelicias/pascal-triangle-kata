package com.developersdelicias;

import java.util.Objects;

public class Value {
	private final Number number;

	Value(Number number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return number.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null || getClass() != o.getClass()) return false;

		Value other = (Value) o;

		return Objects.equals(this.number, other.number);
	}

	@Override
	public int hashCode() {
		return number.hashCode();
	}

	public Number value() {
		return this.number;
	}
}
