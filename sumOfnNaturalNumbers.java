// Sum of n natural numbers.

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		int sum = 0;
		for( int i=1; i<=n; i++){
			sum = sum+i;
		}
		System.out.print(sum);
	}
}