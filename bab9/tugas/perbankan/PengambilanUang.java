package perbankan;

public class PengambilanUang extends Tabungan{
	private int proteksi;

	public PengambilanUang(int saldo){
		super(saldo);
	}
	public PengambilanUang(int saldo, int tingkatBunga){
		super(saldo);
		this.proteksi = tingkatBunga;
	}
	
	public int getSaldo(){
		return ((Tabungan)this).saldo;
	}
	public boolean ambilUang(int jumlah){
		int saldoNew = getSaldo();
		if(jumlah <= (saldoNew-proteksi) && jumlah >= 0){
			saldoNew-=jumlah;
			return true;
		}else{
			return false;
		}
	}
}
