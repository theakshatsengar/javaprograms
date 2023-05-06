import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first Number: ");
		int a = sc.nextInt();
		System.out.print("Enter second Number: ");
		int b = sc.nextInt();
		
		System.out.print("Enter 1 : Addition \nEnter 2 : Subtraction \nEnter 3 : Multiplication \nEnter 4 : Division \nEnter your choice: ");
		int x = sc.nextInt();
		
		switch(x) {
			case 1: System.out.println(a+b);
			break;
			case 2: System.out.println(a-b);
			break;
			case 3: System.out.println(a*b);
			break;
			case 4: System.out.println(a/b);
			}
	}
}