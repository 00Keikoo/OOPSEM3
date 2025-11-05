public class Test{
	public static void main(String[] args){
		Audio jbl = new Audio("JBL");
		UsbFlash song = new UsbFlash("Concubine");
		Car a = new Car();

		a.replaceWheel();
		a.installAudio(jbl);
		a.playMusic(song);	
	}
}
