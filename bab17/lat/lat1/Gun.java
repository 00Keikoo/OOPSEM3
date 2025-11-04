public class Gun extends Weapon{
	public int bullets;

	public Gun(int bullets){
		this.bullets = bullets;	
	}

	public void attack(){
		System.out.println("Menembakkan peluru");
		System.out.println("Sisa peluru: "+ --this.bullets);
	}
}
