package kendaraan;

public class Kendaraan{

	protected int jmlRoda;
	protected String warna;

	public Kendaraan(int jmlRoda, String warna){
		this.jmlRoda=jmlRoda;
		this.warna=warna;
	}

	public void setJmlRoda(int jmlRoda){
		if(jmlRoda < 1) return;
		this.jmlRoda = jmlRoda;
	}
	public int getJmlRoda(){
		return this.jmlRoda;
	}
	public void setWarna(String warna){
		if(warna ==null || warna.trim().isEmpty()){
			this.warna="None";
		}
		this.warna = warna;
	}
	public String getWarna(){
		return this.warna;
	}
}
