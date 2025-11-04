public class TestInterface{
	public static void main(String args[]){
		SmartPhone sp = new SmartPhone("0812489264");

		sp.call();
		sp.receiveCall();
		sp.captureImage();
		sp.readCard();
	}
}
