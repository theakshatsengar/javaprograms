import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int rows = sc.nextInt();
		int colmns = sc.nextInt();
		
		int array[][] = new int[rows][colmns];
	
	    //input
	    System.out.print("Enter the elements of array: ");		//rows
		for(int i=0; i<rows; i++){
			//colmns
			for(int j=0; j<colmns; j++){
			array[i][j] = sc.nextInt();
			}
		}
		//output
	    System.out.println("the array is : ");		
	    //rows
		for(int i=0; i<rows; i++){
			//colmns
			for(int j=0; j<colmns; j++){
			System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.print("Enter number you want to search: ");
		int x = sc.nextInt();	
		
		for(int i=0; i<rows; i++){
			 for(int j=0; j<colmns; j++){
			 if(array[i][j] == x){
			System.out.print("found at "+ i +","+ j);
			 }
			}
		}

		
	}
}