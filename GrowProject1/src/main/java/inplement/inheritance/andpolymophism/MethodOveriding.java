package inplement.inheritance.andpolymophism;

public class MethodOveriding extends MethodOverloading{

	@Override
	public int addnum(int a, int b) {
		System.out.println("The addition of number "+a+" and "+b+" is :");
		return a+b;
	}
	
	@Override
	public int addnum(int a, int b,int c) {
		System.out.println("The addition of number "+a+","+b+" and "+c+" is :");
		return a+b+c;
	}
}
