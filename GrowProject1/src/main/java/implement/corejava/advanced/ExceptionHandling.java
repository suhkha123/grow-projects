package implement.corejava.advanced;

import java.util.Scanner;

public class ExceptionHandling {
	
	public int enterAge() throws ArithmeticException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your age(in numbers)?");
		int age = sc.nextInt();
		if (age < 0 || age > 100)
			throw new ArithmeticException("Invalid age: Age should be in between 0 and 100.");	
		return age;		
	}
	
	public void validateAge(int age){
		try {
			if (age >17 && age < 101)
				System.out.println("You are eligible to vote.");
			else
				System.out.println("You are not eligible to vote.");
		}finally {
			System.out.println("Thanks for participating.");

		}
	}
	
	public void throwable() {
		try {
			int a = 100/0;
		}catch(Exception e){
			e.addSuppressed(e);
			e.fillInStackTrace();
			e.getCause();
			e.getClass();
			e.getMessage();
			e.getLocalizedMessage();
			e.getStackTrace();
			e.printStackTrace();
		}
		
		
	}

}
