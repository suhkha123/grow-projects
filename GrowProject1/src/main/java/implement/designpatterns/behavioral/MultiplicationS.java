package implement.designpatterns.behavioral;

public class MultiplicationS implements Strategy{

	private float a;
	private float b;

	public MultiplicationS(float a, float b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public float calculation() {
		return a*b;
	}
}
