// Program to print a pattern of numbers and stars.

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j);
			}
			for(int j=1; j<=n-i; j++){
				System.out.print("*");
			}
			for(int j=1; j<=n-i; j++){
				System.out.print("*");
			}
			for(int j=n; j>=n-i+1; j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}