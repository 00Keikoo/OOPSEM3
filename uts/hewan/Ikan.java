package hewan;

public class Ikan extends HewanAir{
	private String warna;
	private String jenis;

	public Ikan(String nama, String tipeSirip){
		super(nama, tipeSirip);
		this.warna = " ";
		this.jenis = " ";
	}
	public Ikan(String nama, String tipeSirip, String warna){
		super(nama, tipeSirip);
		this.warna = warna;
		this.jenis = " ";
	}
	public Ikan(String nama, String tipeSirip, String warna, String jenis){
		super(nama, tipeSirip);
		this.warna = warna;
		this.jenis = jenis;
	}

	public void buatSuara(){
		System.out.println(getNama() + " says : Blup Blup");
	}

}
