package com.developersdelicias;

public class PascalTriangle {

	public PascalTriangle(int level) {

	}

	public String triangleOf(int level) {
		return level == 1 ? triangleOfLevelOne()
				: level == 2 ? triangleOfLevelTwo()
				: level == 3 ? triangleOfLevelThree() : noTriangle();
	}

	private String noTriangle() {
		return "";
	}

	public String triangleOfLevelOne() {
		return Level.levelOne();
	}

	public String triangleOfLevelTwo() {
		return Level.levelOne() + Levels.levelSeparator() + Level.levelTwo();
	}

	public String triangleOfLevelThree() {
		return Level.levelOne() + Levels.levelSeparator() + Level.levelTwo() + Levels.levelSeparator() + Level.levelThree();
	}

	public Levels levels() {
		return new Levels(
				new Level(
						new Value(1)
				),
				new Level(
						new Value(1),
						new Value(1)
				),
				new Level(
						new Value(1),
						new Value(2),
						new Value(1)

				)
		);

	}
}
