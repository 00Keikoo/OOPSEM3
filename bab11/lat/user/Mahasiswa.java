package user;

public class Mahasiswa extends User{

	private Dosen dosenWali;
	private String kelas;

	public Mahasiswa(){
	
	}

	public Mahasiswa(String username, String password){
		super(username, password);
	}

	public Dosen getDosenWali(){
		return this.dosenWali;
	}
	public void setDosenWali(Dosen dosenWali){
		this.dosenWali = dosenWali;
	}

	public String getKelas(){
		return this.kelas;
	}
	public void setKelas(String kelas){
		this.kelas = kelas;
	}

	@Override
	public boolean login(String username, String password){
		return super.login(username, password);
	}
}
