import java.util.Scanner;
public class Tugas2{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		String string = "Selamat Datang di PENS";
		System.out.println(string);
		System.out.println("Opsi: ");
		System.out.println("a.Konversikan semua karakter menjadi huruf  kapital");
		System.out.println("b.Konversikan semua karakter menjadi huruf  kapital");
		System.out.println("c.Tampilkan panjang string");
		System.out.println("d.Tampilkan indek kata PENS");
		System.out.println("Pilih : ex(a)");
		char input = scanner.next().charAt(0);
		if(input == 'a' || input=='A' || input=='b' || input=='B'){
			String kapital = string.toUpperCase();
			System.out.println(kapital);
		}else if(input =='c' || input =='C'){
			System.out.println("Panjang string : " +string.length());
		}else if(input =='d'|| input=='D'){
			int indexInput=string.indexOf("PENS");
			System.out.println("Index dari kata PENS " +""+indexInput);

		}else{
			System.out.println("Invalid input!");
		}
	}
}
