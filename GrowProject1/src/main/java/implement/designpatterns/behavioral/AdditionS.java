package implement.designpatterns.behavioral;

public class AdditionS implements Strategy{
	
	private float a;
	private float b;

	public AdditionS(float a, float b) {
		super();
		this.a = a;
		this.b = b;
	}

	public float calculation() {
		return a+b;
	}
}
