package com.developersdelicias;

public class PascalTriangle {

	private final int level;

	PascalTriangle(int level) {
		this.level = level;
	}

	public Levels levels() {
		Level[] levels = new Level[level];
		if (this.level == 1)
			levels[0] = levelOne();

		if (this.level == 2) {
			levels[0] = levelOne();
			levels[1] = levelTwo();
		}

		if (this.level == 3) {
			levels[0] = levelOne();
			levels[1] = levelTwo();
			levels[2] = levelThree();
		}

		return new Levels(levels);
	}

	private Level levelThree() {
		return new Level(
				valueOfOne(),
				valueOfTwo(),
				valueOfOne()

		);
	}

	private Value valueOfTwo() {
		return new Value(2);
	}

	private Value valueOfOne() {
		return new Value(1);
	}

	private Level levelTwo() {
		return new Level(
				valueOfOne(),
				valueOfOne()
		);
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
