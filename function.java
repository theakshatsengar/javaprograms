import java.util.*;

public class Main {
	public static int Sum(int a, int b) {
		int Sum = a+b;	
		return Sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Enter both number: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		int n= Sum(a, b);
		System.out.println("The sum is "+ n);
		
	}
}