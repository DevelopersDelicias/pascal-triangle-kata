package com.developersdelicias;

import java.util.Arrays;
import java.util.Objects;

public class Values {
	private final Value[] values;

	public Values(Value... values) {
		this.values = values;
	}

	public static String valueSeparator() {
		return ", ";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o == null || getClass() != o.getClass()) return false;

		Values other = (Values) o;

		return Arrays.equals(this.values, other.values);
	}

	@Override
	public String toString() {
		StringBuilder out = new StringBuilder("");
		for (int currentIndex = 0; currentIndex < values.length; currentIndex++) {
			out.append(values[currentIndex]);
			if (values.length > 1 && currentIndex < values.length - 1)
				out.append(valueSeparator());
		}

		return out.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(values);
	}
}
