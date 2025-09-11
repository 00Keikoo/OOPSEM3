import java.util.Scanner;
class Fibonacci{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan berapa deret Fibonacci? ");
		int n = scanner.nextInt();
		int a=0;
		int b=1;
		int sum = 0;
		System.out.print(" "+ b);
		for(int i = 0; i <n; i++){
			sum = a+b;
			a=b;
			b=sum;
			System.out.print(" " + sum);
		}
	}
}
