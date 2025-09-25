public class Mahasiswa extends User{
	private Dosen dosenWali;
	private String kelas;

	public Mahasiswa(){
		super();
		this.dosenWali=new Dosen();
		this.kelas = " ";
	}

	public Mahasiswa(String username, String password){
		super(username, password);
		this.dosenWali=new Dosen();
		this.kelas = " ";
	}

	public Mahasiswa(String username, String password, String phone){
		super(username, password, phone);
		this.dosenWali=new Dosen();
		this.kelas = " ";
	}

	public void setKelas(String kelas){
		this.kelas = kelas; 
	}
	public String getKelas(){
		return this.kelas;
	}
}
