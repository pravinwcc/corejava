package basics.enumtest;

public enum Notes {
	HUNDREDE(100), FIFTY(50), TWENTY(20), TEN(10);
	private int value;

	private Notes(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
/*
	public boolean equals(Object other) {
		return this == other;
	}*/
}
