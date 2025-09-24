class Base{
	Base(int i){
		System.out.println("base constructor");
	}
	Base(){}
}

public class Sup extends Base{
	public static void main(String argv[]){
		Sup s = new Sup();
	}
	Sup(){
		super(69);
	}
	public void derived(){
		// baris 3
	}
}
