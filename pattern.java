import java.util.*;

public class Main {
	public static void main(String[] args) {
		//To print a rectangle.of stars
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n= sc.nextInt();
		System.out.print("m: ");
		int m= sc.nextInt();
		
		System.out.println("\nOutput: \n");
		for(int i=1; i<=n;i++){
			for(int j=1; j<=m; j++){
				System.out.print("* ");
	    	} System.out.println();
		}
		System.out.println();
		//To print hollow rectangle
			for(int i=1; i<=n;i++){
			for(int j=1; j<=m; j++){
				if(i==1 || j==1 || i==n || j==m ){
				System.out.print("* ");
				} else{
				 	System.out.print("  ");
				 	}
	    	} System.out.println();
		}
		System.out.println();
		//To print solid triangle
		for(int i=1; i<=n;i++){
			for(int j=1; j<=i; j++){
				System.out.print("* ");
	    	} System.out.println();
		}
		System.out.println();
		//To print inverted solid triangle
		for(int i=1; i<=n;i++){
			for(int j=n; j>=i; j--){
				System.out.print("* ");
	    	} System.out.println();
		}
		
		//To print a solid triangle from right side
		
		for(int i=1; i<=n; i++){
			for(int j=n-i; j>=1; j--){
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}