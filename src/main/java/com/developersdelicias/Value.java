package com.developersdelicias;

import java.math.BigDecimal;

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

		return toBigDecimal().equals(other.toBigDecimal());
	}

	@Override
	public int hashCode() {
		return number.hashCode();
	}

	public Number value() {
		return this.number;
	}

	public Value plus(Value otherValue) {
		return new Value(toBigDecimal().add(otherValue.toBigDecimal()));
	}

	private BigDecimal toBigDecimal() {
		return new BigDecimal(this.value().toString());
	}
}
