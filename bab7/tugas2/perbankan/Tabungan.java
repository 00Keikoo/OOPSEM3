package perbankan;

public class Tabungan{
	private int saldo;

	public Tabungan(int saldo){
		this.saldo=saldo;
	}
	public int getSaldo(){
		return this.saldo;
	}

	public void simpanUang(int jumlah){
		saldo=saldo+jumlah;
	}
	public boolean ambilUang(int jumlah){
		if(this.saldo - jumlah >= 0){
			this.saldo = this.saldo-jumlah;
			return true;
		}else{
			return false;
		}
	}
}
