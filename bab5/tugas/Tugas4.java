import java.util.Scanner;

public class Tugas4{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("String nama pertama: ");
		String input1 = scanner.nextLine();
		System.out.print("String nama kedua: ");
		String input2 = scanner.nextLine();

		String[] kalimat1 = input1.split(" ");
		String[] kalimat2 = input2.split(" ");
	
		System.out.println("String nama pertama: " +kalimat1[0] +" " +kalimat2[1]);
		System.out.println("String nama kedua: "+kalimat2[0]+" " +kalimat1[1]);
	}
}
