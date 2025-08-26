public class TesMobil{
	public static void main(String[] args){
		Mobil mobil1 = new Mobil("mobil1");
		mobil1.setMerk("Toyota");
		mobil1.setWarna("biru");
		mobil1.setTipe("minibus");
		mobil1.setHarga(2000);
		mobil1.setJumlah(7);
		
		Mobil mobil2 = new Mobil("mobil2");
		mobil2.setMerk("Daihatsu");
		mobil2.setWarna("hitam");
		mobil2.setTipe("pick up");
		mobil2.setHarga(1500);
		mobil2.setJumlah(2);

		Mobil mobil3 = new Mobil("mobil3");
		mobil3.setMerk("Suzuki");
		mobil3.setWarna("silver");
		mobil3.setTipe("suv");
		mobil3.setHarga(1800);
		mobil3.setJumlah(5);

		Mobil mobil4 = new Mobil("mobil4");
		mobil4.setMerk("Honda");
		mobil4.setWarna("merah");
		mobil4.setTipe("sedan");
		mobil4.setHarga(1300);
		mobil4.setJumlah(5);

		mobil1.infoMobil("mobil1");
		mobil2.infoMobil("mobil2");
		mobil3.infoMobil("mobil3");
		mobil4.infoMobil("mobil4");
	}

}
