public class Dosen extends User{
	private String pangkat, golongan, key;

	public Dosen(){
		super();
		this.pangkat=" ";
		this.golongan=" ";
		this.key=" ";
	}

	public Dosen(String username, String password){
		super(username, password);
		this.pangkat=" ";
		this.golongan=" ";
		this.key=" ";
	}
	
	public boolean login(String username, String password){
		if(getUsername().equals(username) && getPassword().equals(password)){
			return true;
		}
		return false;
	}

	public boolean login(String username, String password, String key){
		if(getUsername().equals(username) && getPassword().equals(password) && this.key=key){
			return true;
		}
		return false;
	}

	public boolean login(long phone, String password){
		if(getPhone().equals(phone) && getPassword().equals(password)){
			return true;
		}
		return false;
	}

	public boolean login(long phone, String password, String key){
		if(getPhone().equals(phone) && getPassword().equals(password) && this.key==key){
			return true;
		}
		return false;
	}

	public void setPangkat(String pangkat){
		this.pangkat=pangkat;
	}
	public String getPangkat(){
		return this.pangkat;
	}

	public void setGolongan(String golongan){
		this.golongan=golongan;
	}
	public String getGolongan(){
		return this.golongan;
	}
	public void setKey(String key){
		this.key=key;
	}
	public String getKey(){
		return this.key;
	}
}
