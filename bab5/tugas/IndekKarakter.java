import java.util.Scanner;
public class IndekKarakter{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan string : ");
		String input = scanner.nextLine();
		System.out.print("Masukkan karakter : ");
		char kar= scanner.next().charAt(0);
		System.out.print("Karakter "+ kar + "ada pada index ");
		boolean ketemu=false;
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i)==kar){
				if(ketemu){
					System.out.print(", "+i);
				}else{
					System.out.print(i);
					ketemu=true;
				}
			}
		}
	}
}
