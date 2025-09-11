import java.util.Scanner;

public class Tugas3{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan string: ");
		String input = scanner.nextLine();

		String[] kalimat = input.split(" ");
		StringBuilder sum = new StringBuilder();

		for(String kalimats : kalimat){
			if(kalimats.length() > 1){
				char first = kalimats.charAt(0);
				char last = kalimats.charAt(kalimats.length() -1);
				String newKalimat = last + kalimats.substring(1, kalimats.length() -1 ) + first;
				sum.append(newKalimat).append(" ");
			}else{
				sum.append(kalimats).append(" ");
			}
		}
		System.out.println("String hasil : " + sum.toString().trim());
	}
}
