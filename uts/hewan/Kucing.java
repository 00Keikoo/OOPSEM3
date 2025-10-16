package hewan;

public class Kucing extends HewanDarat{
	private String warna;
	private String jenis;

	public Kucing(String nama, int jumlahKaki){
		super(nama, jumlahKaki);
		this.warna = " ";
		this.jenis = " ";
	}
	public Kucing(String nama, int jumlahKaki, String warna){
		super(nama, jumlahKaki);
		this.warna = warna;
		this.jenis = " ";
	}

	public Kucing(String nama, int jumlahKaki, String warna, String jenis){
		super(nama, jumlahKaki);
		this.warna = warna;
		this.jenis= jenis;
	}

	public void buatSuara(){
		System.out.println(getNama() + " : Meow....");
	}
}
