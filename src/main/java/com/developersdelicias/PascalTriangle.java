package com.developersdelicias;

public class PascalTriangle {

	private final int numberOfLevels;

	PascalTriangle(int numberOfLevels) {
		this.numberOfLevels = numberOfLevels;
	}

	public Levels levels() {
		Level[] levels = new Level[numberOfLevels];
		if (this.numberOfLevels >= 1) {
			levels[0] = levelOne();
			for (int nextLevel = 1; nextLevel < this.numberOfLevels; nextLevel++) {
				levels[nextLevel] = createNewLevel(levels[nextLevel - 1], nextLevel + 1);
			}
		}
		return new Levels(levels);
	}

	private Level createNewLevel(Level previousLevel, int nextLevel) {
		Values newValues = new Values();
		for (int i = 0; i < nextLevel ; i++) {
			newValues.add(previousLevel.valueAt(i - 1). plus(previousLevel.valueAt(i)));
		}
		return new Level(newValues);
	}

	private Value valueOfOne() {
		return new Value(1);
	}


	private Level levelOne() {
		return new Level(
				valueOfOne()
		);
	}

	@Override
	public String toString() {
		return levels().toString();
	}
}
