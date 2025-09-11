public class Test{
	public static void main(String args[]){
		Kendaraan k1 = new Kendaraan();
		k1.nomorPolisi = "S 7867 KM";
		k1.jenis="Motor";
		k1.merk="Beat";

		Pelanggan p1 = new Pelanggan();
		p1.nama="Dian";
		p1.noHp="081217483939";
		p1.setKendaraan(k1);

		Bengkel bengkel=new Bengkel();
		bengkel.namaBengkel="Arto Moro";
		bengkel.alamat="Jl.Soekarno No.12";

		bengkel.tambahPelanggan(p1);
		bengkel.tampilkanSemuaPelanggan();

		System.out.println("Apakah Dian terdaftar? "+bengkel.cariPelanggan("Dian"));	
		System.out.println("Apakah Budi terdaftar? "+bengkel.cariPelanggan("Budi"));
		
	}
}
