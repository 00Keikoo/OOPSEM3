package perbankan;

public class Bank{
	private Nasabah[] nasabah;
	private int jumlahNasabah;

	public Bank(){
		this.nasabah=new Nasabah[4];
		this.jumlahNasabah=0;
	}
	public void tambahNasabah(String namaAwal, String namaAkhir){
		this.nasabah[this.jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
		this.jumlahNasabah+=1;
	}

	public int getJumlahNasabah(){
		return this.jumlahNasabah;
	}
	public Nasabah getNasabah(int indeks){
		return this.nasabah[indeks];
	}
}
