public class Main {
	public static void printSum(int n, int sum){
		
		if(n==1){
			sum = sum*n;
			System.out.println(sum);
			return;
		}
		
		sum = sum*n;
		printSum(n-1, sum);
		
	}
	public static void main(String[] args) {
		int n = 6;
		int sum = 1;
		
		printSum(n, sum);
	}
}