import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		
		for(int i=2; i<=sum; i++){
			int divd = sum%i;
			if(divd==0){
			System.out.println("NotPrime");
			
			}else{
				System.out.println("Prime");
			}
			break;
	    }
	}
}