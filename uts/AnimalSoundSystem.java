import hewan.*;

public class AnimalSoundSystem{
	public static void main(String[] args){
		Hewan hewan1 = new Kucing("Jason", 4, "Putih", "Anggora");
		Hewan hewan2 = new Kucing("Pablo", 4, "Hitam Putih", "Himalaya");
		Hewan hewan3 = new Ikan("Tan", "Dorsal", "Orange", "Ikan Koi");

		System.out.println("Suara Hewan: ");
		hewan1.buatSuara();
		hewan2.buatSuara();
		hewan3.buatSuara();
	}
}
