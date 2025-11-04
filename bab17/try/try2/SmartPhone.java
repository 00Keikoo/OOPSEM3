public class SmartPhone extends Phone implements Camera, CardReader{
	public Lens lens;

	public SmartPhone(String phoneNumber){
		super(phoneNumber);
		this.lens = new Lens();
	}
	
	public void call(){
		System.out.println("call from "+ phoneNumber);
	}

	public void receiveCall(){
		System.out.println("receiveCall from "+ phoneNumber);
	}

	public void captureImage(){
		System.out.println("captureImage from "+ lens.getType() + "lens");
	}

	public void readCard(){
		System.out.println("readCard from " + phoneNumber);


	}
}

class Lens{
	private String type = "Wide";

	public String getType(){
		return type;
	}
}

