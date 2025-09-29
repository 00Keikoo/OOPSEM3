package user;

public class Dosen extends User{
	private String pangkat;
	private String golongan;
	private int key;

	public Dosen(){
	
	}
	public Dosen(String username, String password){
		super(username, password);
	}

	public String getPangkat(){
		return this.pangkat;
	}
	public void setPangkat(String pangkat){
		this.pangkat = pangkat;
	}

	public String getGolongan(){
		return this.golongan;
	}
	public void setGolongan(String golongan){
		this.golongan = golongan;
	}

	public int getKey(){
		return this.key;
	}
	public void setKey(int key){
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
