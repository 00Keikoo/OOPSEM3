package user;

public class Dosen extends User{
	private String pangkat;
	private String golongan;
	private int key;

	public Dosen(String username, String password, int key){
		super(username, password);
		this.key = key;
	}

	@Override
	public boolean login(String username, String password){
		return super.login(username, password);
	}

	public boolean login(String username, String password, int key){
		return super.login(username, password) && this.key == key;
	}

}
