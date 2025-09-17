public class Truk{
	private double muatan, muatanmaks;

	public Truk(double beratmaks){
		this.muatan=0;
		this.muatanmaks=beratmaks;
	}

	public double getMuatan(){
		return this.muatan;
	}
	public double getMuatanMaks(){
		return this.muatanmaks;
	}

	public boolean tambahMuatan(double berat){
		if(muatan+berat < muatanmaks){
			this.muatan += berat;
			return true;
		}
			
		else
			return false;
	}

	public double newtsToKilo(double berat){
		return berat/9.8;
	}
	public double kiloToNewts(double berat){
		return berat*9.8;
	}
}
