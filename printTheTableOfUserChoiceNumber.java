// Sum of n natural numbers.

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		int sum = 1;
		for( int i=1; i<=10; i++){
			sum = n*i;
			System.out.println(sum);
		}
	}
}