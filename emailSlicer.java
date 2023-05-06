import java.util.*;
public class Main {
	public static void main(String[] args) {
		System.out.print("Enter your email: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println();
			
		for(int i=name.length(); i>0; i--){
			Character ch = new Character('@');
			if(name.charAt(i-1) == ch){
				System.out.print("Your email initial is: ");
				for(int j=0; j<i-1; j++){
					System.out.print(name.charAt(j));
				}
			}
			
		}
	}
}