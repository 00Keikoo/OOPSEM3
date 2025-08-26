public class Tabungan {
	int saldo;
	public Tabungan(int initsaldo){
		saldo = initsaldo;
	}
	public void simpanUang(int jumlah){
		saldo = saldo + jumlah;
	}
	public int getSaldo(){
		return saldo;
	}
	public boolean ambilUang(int jumlah){
		if(saldo - jumlah <= 0){
			return false;
		}else{
			saldo = saldo-jumlah;
			return true;
		}
	}
}
