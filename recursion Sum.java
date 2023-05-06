public class Main {
	public static void printSum(int n, int sum){
		
		if(n==0){
			sum = sum+(n+1);
			System.out.println(sum);
			return;
		}
		
		sum = sum+(n+1);
		printSum(n-1, sum);
		
	}
	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		
		printSum(n-1, sum);
	}
}