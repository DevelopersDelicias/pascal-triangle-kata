package com.developersdelicias;

import java.util.*;

import static java.util.Arrays.asList;

public class Values {
	private final List<Value> values;

	Values(Value... values) {
		this.values = new ArrayList<>(asList(values));
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o == null || getClass() != o.getClass()) return false;

		Values other = (Values) o;

		return Objects.equals(this.values, other.values);
	}

	@Override
	public String toString() {
		StringBuilder out = new StringBuilder("");
		for (int currentIndex = 0; currentIndex < this.size(); currentIndex++) {
			out.append(values.get(currentIndex));
			if (this.size() > 1 && currentIndex < this.size() - 1)
				out.append(valueSeparator());
		}

		return out.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(values);
	}

	public Value valueAt(int index) {
		return values.get(index);
	}

	public int size() {
		return values.size();
	}

	private String valueSeparator() {
		return ", ";
	}

	public void add(Value... newValues) {
		this.values.addAll(asList(newValues));
	}
}
