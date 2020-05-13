package implement.corejava.advanced;

public enum SeasonTempEnum {
	
	
	Winter(23), Summer(40), Monsoon(27);
	
	private int value;
	
	SeasonTempEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
}
