package com.developersdelicias;

import java.util.Arrays;

public class Levels {
	private final Level[] levels;

	public Levels(Level ... levels) {
		this.levels = levels;
	}

	public static String levelSeparator() {
		return ", ";
	}

	@Override
	public String toString() {
		return Arrays.toString(levels);
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) return true;
		if (other == null || getClass() != other.getClass()) return false;
		Levels otherLevels = (Levels) other;
		return Arrays.equals(levels, otherLevels.levels);
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(levels);
	}
}
