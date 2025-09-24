package kendaraan;

public class Sepeda extends Kendaraan{

	protected int jmlSadel;
	protected int jmlGir;

	public Sepeda(int jmlRoda, String warna, int jmlSadel, int jmlGir){
		super(jmlRoda, warna);
		this.jmlSadel=jmlSadel;
		this.jmlGir=jmlGir;
	}

	public void setJmlSadel(int sadel){
		if(jmlSadel<0)return;
		this.jmlSadel = sadel;
	}
	public int getJmlSadel(){
		return this.jmlSadel;
	}
	public void setJmlGir(int gir){
		if(jmlGir<0)return;
		this.jmlGir = gir;
	}
	public int getJmlGir(){
		return this.jmlGir;
	}
}
