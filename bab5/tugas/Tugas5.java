import java.util.Scanner;

public class Tugas5{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan kalimat utama: ");
		String input1 = scanner.nextLine();
		
		System.out.print("Kata yang diganti: ");
		String input2 = scanner.nextLine();
		
		System.out.print("Kata pengganti:  ");
		String input3 = scanner.nextLine();

		String sum = input1.replace(input2, input3);
		System.out.print("Kalimat utama menjadi: " +sum);
		
	}
}
