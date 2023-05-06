import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++){
			int spac = (n-i)/2;
			for(int j=1; j<=spac; j++ ){
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}