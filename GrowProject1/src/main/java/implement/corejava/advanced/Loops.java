package implement.corejava.advanced;

public class Loops {

	public void printName(String[] arr) {
		int i=1;
		for(String a: arr) {
			System.out.println(i+" position name is "+a);
			i=i+1;
		}
	}
	
	public boolean testNum(int num) {
		while(num%2==0) {
			return	true;
					}
		return false;
	}
	
	public void printNum(int num) {
		
		do {
			System.out.println("0 is not accepted.");;
			}while(num<0);
	}
}
