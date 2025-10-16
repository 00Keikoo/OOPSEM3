package hewan;

public class HewanAir extends Hewan{
	private String tipeSirip;

	public HewanAir(String nama, String tipeSirip){
		super(nama);
		this.tipeSirip = tipeSirip;
	}

	public void buatSuara(){
		System.out.println(getNama()+ "Diam di air");
	}
}
