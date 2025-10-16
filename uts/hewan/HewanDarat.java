package hewan;

public class HewanDarat extends Hewan{
	private int jumlahKaki;

	public HewanDarat(String nama, int jumlahKaki){
		super(nama);
		this.jumlahKaki = jumlahKaki;
	}

	public void buatSuara(){
		System.out.println(getNama() + "bersuara di darat");
	}


}

