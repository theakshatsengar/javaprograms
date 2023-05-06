import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++){
			for(int j=i; j<=n-1; j++){
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++){
				
				if( i==0 || j==0 || (j==i) ){
					System.out.print(1+" ");
				}
				else{
					System.out.print(+" ");
				}
			}
			System.out.println(" ");
		}
	}
}