import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int size = sc.nextInt();
		int numbers[] = new int[size];
		//input
		System.out.print("Enter the elements of array: ");
		for(int i=0; i<size; i++){
			numbers[i] = sc.nextInt();
			}

		System.out.print("Enter number you want to search: ");
			
		int x = sc.nextInt();	
		for(int i=0; i<size; i++){
			 if(numbers[i] == x){
			System.out.println("found at "+ i);
			 }
		}
	}
}