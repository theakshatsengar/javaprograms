import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int a= sc.nextInt();
		
		if(a >18 && 100>a ){
			System.out.println("You're an Adult.");
		} else if( a>100){
			System.out.println("Invalid age, maybe you're a ghost.");
		} else {
			System.out.println("You're not an Adult.");
			}
	}
}