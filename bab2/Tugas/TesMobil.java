
public class TesMobil{
	public static void main(String[] args){
		Mobil mobil1 = new Mobil("Toyota", "Biru", "minibus", 2000, 7);
		Mobil mobil2 = new Mobil("Daihatsu", "hitam", "pick up", 1500, 2);
		Mobil mobil3 = new Mobil("Suzuki", "silver", "suv", 1800, 5);
		Mobil mobil4 = new Mobil("Honda", "merah", "sedan", 1300, 5);

		mobil1.printMerek();
		mobil1.printWarna();
		mobil1.printTipe();
		mobil1.printHarga();
		mobil1.printJumlah();
		mobil2.printMerek();
		mobil2.printWarna();
		mobil2.printTipe();
		mobil2.printHarga();
		mobil2.printJumlah();
		mobil3.printMerek();
		mobil3.printWarna();
                mobil3.printTipe();
                mobil3.printHarga();
                mobil3.printJumlah();
		mobil4.printMerek();
		mobil4.printWarna();
                mobil4.printTipe();
                mobil4.printHarga();
                mobil4.printJumlah();
	}

}
