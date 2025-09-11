import java.util.ArrayList;
public class Bengkel{
	public String namaBengkel;
	public String alamat;
	ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();

	public void tambahPelanggan(Pelanggan p){
		daftarPelanggan.add(p);
	}

	public ArrayList<Pelanggan> getDaftarPelanggan(){
		return daftarPelanggan;
	}

	public void tampilkanSemuaPelanggan(){
		System.out.println("=== Daftar Pelanggan Bengkel "+namaBengkel+"===");
		for(Pelanggan p: daftarPelanggan){
			p.tampilkanData();
		}
	}

	public boolean cariPelanggan(String nama){
		for(Pelanggan p: daftarPelanggan){
			if(p.getNama().equalsIgnoreCase(nama))
				return true;
		}
		return false;
	}
}
