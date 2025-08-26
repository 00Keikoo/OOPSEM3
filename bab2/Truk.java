public class Truk {
	double muatan;
	double muatanMaks;

	public Truk(double beratmaks){
		muatanMaks = beratmaks;
	}
	public void tambahMuatan(double berat){
		if(muatanMaks >= muatan+berat)
			muatan = muatan + berat;
	}
	public double getMuatan(){
		return muatan;
	}
	public double getMuatanMaks(){
		return muatanMaks;
	}
}
