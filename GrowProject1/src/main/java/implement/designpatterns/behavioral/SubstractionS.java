package implement.designpatterns.behavioral;

public class SubstractionS implements Strategy{

	private float a;
	private float b;

	public SubstractionS(float a, float b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public float calculation() {
		return a-b;
	}
}
