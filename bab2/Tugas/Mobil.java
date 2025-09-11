public class Mobil {
	private String merk;
	private String warna;
	private String tipe;
	private int harga;
	private int jumlah;

	public Mobil(String merk, String warna, String tipe, int harga, int jumlah){
		this.merk = merk;
		this.warna = warna;
		this.tipe= tipe;
		this.harga= harga;
		this.jumlah=jumlah;
	}

	public void printMerek(){
		System.out.println("merk : " + merk);
	}

	public void printWarna(){
		System.out.println("warna : " + warna);
	}

	public void printTipe(){
		System.out.println("Tipe : " + tipe);
	}

	public void printHarga(){
		System.out.println("Harga : " + harga);
	}

	public void printJumlah(){
		System.out.println("Jumlah : " + jumlah);
	}

}

