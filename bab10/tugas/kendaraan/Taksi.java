package kendaraan;

public class Taksi extends Mobil{
	protected int tarifAwal;
	protected int tarifPerKm;
	
	public Taksi(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int tarifAwal, int tarifPerKm){
		super(jmlRoda, warna, bahanBakar, kapasitasMesin);
		this.tarifAwal=tarifAwal;
		this.tarifPerKm=tarifPerKm;
	}

	public void setTarifAwal(int tarifAwal){
		if(tarifAwal<0){
			return;
		}
		this.tarifAwal=tarifAwal;
	}

	public int getTarifAwal(){
		return this.tarifAwal;
	}
	public void setTarifPerKm(int tarifPerKm){
		if(tarifPerKm<0){
			return;
		}
		this.tarifPerKm=tarifPerKm;
	}
	public int getTarifPerKm(){
		return tarifPerKm;
	}
}
