package user;

public class Mahasiswa extends User{
	private Dosen dosenWali;
	private String kelas;

	public Mahasiswa(String username, String password, String phone, String kelas){
		super(username, password, phone);
		this.kelas = kelas;
	}

	//Override login
	@Override
	public boolean login(String username, String password){
		return super.login(username, password);
	}
}
