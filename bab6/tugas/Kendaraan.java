public class  Kendaraan{
	public String nomorPolisi;
	public String jenis;
	public String merk;

	public void tampilkanInfo(){
		System.out.println("No Polisi: "+nomorPolisi+", Jenis: "+jenis+", Merk: "+merk);
	}

	public String getNomorPolisi(){
		return nomorPolisi;
	}
	
	public void setNomorPolisi(String nomor){
		this.nomorPolisi=nomor;
	}
}
