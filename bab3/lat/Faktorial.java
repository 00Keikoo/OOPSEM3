import java.util.Scanner;
class Faktorial{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan bilangan faktorial: ");
		int faktor= scanner.nextInt();
		int sum = 1;
		System.out.println("n	 n!");
		System.out.println("---------");
		for(int i= 1; i<=faktor; i++){
			sum *=i;
			System.out.println("" + i + "	" + sum);
		}
	}
}
