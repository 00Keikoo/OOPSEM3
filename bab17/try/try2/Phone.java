public class Phone{
	public String phoneNumber;

	public Phone(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public void call(){
		System.out.println("call from Phone");	
	}

	public void receiveCall(){
		System.out.println("receiveCall from Phone");

	}
}
