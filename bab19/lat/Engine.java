import java.util.Scanner;

public class Engine{
	public String type;

	public Engine(){
		Scanner input = new Scanner(System.in);
		Menu();
		System.out.println("Masukkan pilihan mesin: (ex: 1)");
		int option = input.nextInt();
		switch(option){
			case 1 : 
				type = "V4";
				break;
			case 2 : 
				type = "V6";
				break;
			case 3 : 
				type = "V8";
				break;
			case 4 : 
				type = "V12";
				break;
			default : 
				System.out.println("Invalid Input!");
				break;
		}
	}

	private void Menu(){
		System.out.println("1.V4");
		System.out.println("2.V6");
		System.out.println("3.V8");
		System.out.println("4.V12");
	}
}
