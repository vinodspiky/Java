package com.Enum;

public enum MethodsInEnum {
	// Enum types
	EAST(0) {
		@Override
		public void shout() {
			System.out.println("Direction is East !!!");
		}
	},
	WEST(180) {
		@Override
		public void shout() {
			System.out.println("Direction is West !!!");
		}
	},
	NORTH(90) {
		@Override
		public void shout() {
			System.out.println("Direction is North !!!");
		}
	},
	SOUTH(270) {
		@Override
		public void shout() {
			System.out.println("Direction is South !!!");
		}
	};
	// Constructor
	private MethodsInEnum(final int angle) {
		this.angle = angle;
	}

	// Internal state
	private int angle;

	public int getAngle() {
		return angle;
	}

	// Abstract method which need to be implemented
	public abstract void shout();
}
