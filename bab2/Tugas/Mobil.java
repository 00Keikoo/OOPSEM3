public class Mobil {
	String objek;
	String merk;
	String warna;
	String tipe;
	int harga;
	int jumlah;
	
	public Mobil(String o){
		objek = o;
	}
	public void setMerk(String a){
		merk = a;
	}
	public void setWarna(String b){
		warna = b;
	}
	public void setTipe(String c){
		tipe = c;
	}
	public void setHarga(int d){
		harga = d;
	}
	public void setJumlah(int e){
		jumlah = e;
	}

	public void infoMobil(String o){
		System.out.println("Objek : " + o);
		System.out.println("A : " + merk);
		System.out.println("B : " + warna);
		System.out.println("C : " + tipe);
		System.out.println("D : " + harga);
		System.out.println("E : " + jumlah);
	}
}

