public class Pelanggan{
	public String nama;
	public String noHp;
	public Kendaraan kendaraan;

	public void tampilkanData(){
		System.out.println("Nama: "+nama+", No HP: "+noHp);
		if(kendaraan!=null)
			kendaraan.tampilkanInfo();
	}

	public String getNama(){
		return nama;
	}

	public void setKendaraan(Kendaraan k){
		this.kendaraan=k;
	}
	protected Kendaraan getKendaraan(){
		return kendaraan;
	}
}
