package kendaraan;

public class Mobil extends Kendaraan{

	protected String bahanBakar;
	protected int kapasitasMesin;

	public Mobil(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin){
		super(jmlRoda, warna);
		this.bahanBakar=bahanBakar;
		this.kapasitasMesin=kapasitasMesin;
	}

	public void setBahanBakar(String bahanBakar){
		if(bahanBakar==null || bahanBakar.trim().isEmpty()){
			this.bahanBakar="None";
			return;
		}
		this.bahanBakar = bahanBakar;
	}
	public String getBahanBakar(){
		return this.bahanBakar;
	}
	public void setKapasitasMesin(int kapasitas){
		if(kapasitasMesin<0){
			return;
		}
		this.kapasitasMesin=kapasitas;
	}
	public int getKapasitasMesin(){
		return this.kapasitasMesin;
	}
}
