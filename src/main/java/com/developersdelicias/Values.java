package com.developersdelicias;

import java.util.Arrays;
import java.util.Objects;

public class Values {
	private final Value[] values;

	public Values(Value... values) {
		this.values = values;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o == null || getClass() != o.getClass()) return false;

		Values other = (Values) o;

		return Arrays.equals(this.values, other.values);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(values);
	}
}
