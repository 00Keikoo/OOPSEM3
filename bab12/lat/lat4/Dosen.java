public class Dosen extends Orang{
	private int nip;

	public Dosen(String nama){
		super(nama);
		this.nip = 0;
	}
	public Dosen(String nama, int nip){
		super(nama);
		this.nip = nip;
	}
	public Dosen(String nama, int nip, int umur){
		super(nama, umur);
		this.nip = nip;
	}

	public void Info(){
		String nipS = (nip==0) ? "-" : String.valueOf(nip);
		String umurS = (umur==0) ? "-" : String.valueOf(umur);

		System.out.println("Nama: "+nama);
		System.out.println("NIP: "+nipS);
		System.out.println("Umur: "+umurS);
	}
}
