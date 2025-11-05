import java.util.Scanner;

public class Wheel{
	public String type;

	public Wheel(){
		Scanner input = new Scanner(System.in);
		Menu();
		System.out.println("Pilih ban: ");
		int option = input.nextInt();
		switch(option){
			case 1: 
				type = "Small";
				break;
			case 2: 
				type = "Medium";
				break;
			case 3: 
				type = "Big";
				break;
			default: 
				System.out.println("Invalid input!");
				break;
		}
	}

	private void Menu(){
		System.out.println("1. Small");
		System.out.println("2. Medium");
		System.out.println("3. Big");
	}
}

