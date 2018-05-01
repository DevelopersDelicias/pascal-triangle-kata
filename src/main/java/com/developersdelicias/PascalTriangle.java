package com.developersdelicias;

public class PascalTriangle {

	private final int level;

	PascalTriangle(int level) {
		this.level = level;
	}

	public Levels levels() {
		if (this.level == 1)
			return new Levels(
					new Level(
							new Value(1)
					)
			);

		if (this.level == 2) {
			return new Levels(
					new Level(
							new Value(1)
					),
					new Level(
							new Value(1),
							new Value(1)
					)
			);
		}

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

	@Override
	public String toString() {
		return levels().toString();
	}
}
