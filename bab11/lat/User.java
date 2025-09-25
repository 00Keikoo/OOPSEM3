class User{
	private String id, username, password;
	private long phone;

	public User(){
		this.id=" ";
		this.phone=0;
		this.username=" ";
		this.password=" ";
	}
	
	public User(String username, String password){
		this.id=" ";
		this.phone=0;		
		this.username=username;
		this.password=password;
	}
	public boolean login(String username, String password){
		if(this.username.equals(username)  && this.password.equals(password)){
			return true;
		}
		return false;
	}
	
	public boolean login(long phone, String password){
		if(this.phone==phone && this.password.equals(password)){
			return true;
		}
		return false;
	}

	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}

	public void setPhone(long phone){
		this.phone=phone;
	}
	public long getPhone(){
		return this.phone;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getUsername(){
		return this.username;
	}

	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return this.password;
	}
}
