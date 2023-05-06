public class Main {
	public static void main(String[] args) {
		//Get Bit
		int n=5;
		int pos=1;
		int bitM= 1<<pos;
		
		if((bitM & n)==0){
		System.out.println("Bit was Zero.");
		} else{
			System.out.println("Bit was One.");
		}
		
		//Set Bit
		int m=5;
		int poss= 1;
		int bittM= 1<<poss;
		
		int numm= bittM | m;
		System.out.println(numm);
		
		//Clear Bit
		int o=5;
		int posss= 1;
		int bitMa= 1<<posss;
		
		int nummm= bitMa | o;
		System.out.println(nummm);
	}
}