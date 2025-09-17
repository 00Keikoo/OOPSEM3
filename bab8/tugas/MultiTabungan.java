public class MultiTabungan{
	private int saldo;

	public MultiTabungan(int initsaldo){
		this.saldo=initsaldo;
	}
	public int getSaldo(){
		return this.saldo;
	}
	public void simpanUang(int jumlah, String matauang){
		if(matauang.equals("aud")){
			jumlah=jumlah*10000;	
		}else if(matauang.equals("usd")){
			jumlah=jumlah*9000;
		}
		this.saldo+=jumlah;
	}	
	public boolean ambilUang(int jumlah, String matauang){
		if(matauang.equals("aud")){
			jumlah=jumlah*10000;	
		}else if(matauang.equals("usd")){
			jumlah=jumlah*9000;
		}

		if(this.saldo-jumlah > 0){
			this.saldo = this.saldo-jumlah;
			return true;
		}
		return false;
	}
	
}
