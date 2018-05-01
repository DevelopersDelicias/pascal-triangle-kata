package com.developersdelicias;

import java.util.Objects;

public class Level {
	private final Values values;

	Level(Value... values) {
		this.values = new Values(values);
	}

	Level(Values values) {
		this.values = values;
	}

	public Values values() {
		return this.values;
	}

	@Override
	public String toString() {
		return String.format("[%s]", values);
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) return true;
		if (other == null || getClass() != other.getClass()) return false;
		Level otherLevel = (Level) other;
		return Objects.equals(this.values, otherLevel.values);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.values);
	}

	public Value valueAt(int index) {
		if (index < 0 || index >= values.size())
			return new Value(0);

		return this.values.valueAt(index);
	}
}
