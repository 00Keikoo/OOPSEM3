import java.util.Scanner;
class Prima{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan bilangan? ");
		int input = scanner.nextInt();
		if(input <= 1)
			System.out.print(""+input+ "Bukan bilangan prima");
		for(int i=2; i<=Math.sqrt(input);i++){
			if(input %i ==0){
				System.out.print(""+input+" Bukan bilangan prima");
			}else {
				System.out.println(""+input+" Bilangan prima");
				break;
			}
		}
	}
}
