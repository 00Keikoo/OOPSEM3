import java.util.Scanner;
class Kabisat{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan tahun(1900-2005): ");
		int input = scanner.nextInt();
		if(input < 1900){
			System.out.println("Maaf tahun input dibawah 1900");
		}else if(input > 2005){
			System.out.println("Maaf, tahun input diatas 2005");
		}else{
			if(input % 4 == 0){
				System.out.print("" + input);
				System.out.println(" adalah tahun kabisat");
			}else{
				System.out.println(""+ input + " bukan tahun kabisat");
			}
		}
	}
}
