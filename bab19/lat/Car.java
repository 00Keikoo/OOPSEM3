public class Car{
	public Engine engine;
	public Wheel wheels;
	public Audio audio;
	public UsbFlash usb;

	public Car(){
		this.engine = new Engine();
	}
	
	public void replaceWheel(){
		System.out.println("Replace Wheels: ");
		this.wheels = new Wheel();
	}
	public void installAudio(Audio audio){
		this.audio = audio;
		System.out.println("Audio Installed");
	}	

	public void playMusic(UsbFlash usb){
		System.out.println(usb.name + " is played");
	}
}
