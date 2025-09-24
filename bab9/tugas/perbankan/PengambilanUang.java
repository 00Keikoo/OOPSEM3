package perbankan;

public class PengambilanUang extends Tabungan{
	private int proteksi;

	public PengambilanUang(int saldo){
		super(saldo);
		this.proteksi=0;
	}
	public PengambilanUang(int saldo, int tingkatBunga){
		super(saldo);
		this.proteksi = tingkatBunga;
	}
	
	public int getSaldo(){
		return saldo;
	}
	public boolean ambilUang(int jumlah){
		if(jumlah <= (saldo-proteksi) && jumlah >= 0){
			saldo-=jumlah;
			return true;
		}else{
			return false;
		}
	}
}
