import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do{
			System.out.print("Enter your marks: ");
			int marks = sc.nextInt();
			if(marks>=90){
				System.out.println("Good");
			}else if(89>=marks && marks>=70){
				System.out.println("Well done");
			}else if(69>=marks && marks>=0){
				System.out.println("Perfect");
			}else{
				System.out.println("Invalid");
			}
			
			System.out.println("Would you like to continue, press 1 for yes & print 0 for no : ");
			num= sc.nextInt();
		}while(num==1);
	}
}