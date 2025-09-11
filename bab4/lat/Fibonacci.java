import java.util.Scanner;

class Fibonacci {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan jumlah deretan Fibonacci? ");
		int input= scanner.nextInt();
		int fibo[]=new int[input];
		fibo[0]=0;
		fibo[1]=1;
		System.out.print(""+fibo[0]+" ");
		System.out.print(""+fibo[1]+" ");
		for(int i=2; i<input;i++){
			fibo[i]=fibo[i-1]+fibo[i-2];
			System.out.print(""+fibo[i]+" ");
		}
	}
}
