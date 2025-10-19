public class Fans{
	private String name;

	public Fans(){
		this.name = "noname";
	}
	public Fans(String name){
		this.name = name;
	}

	public void showName(){
		System.out.println("Nama : "+name);
	}
	public void watchingPerformance(){
		System.out.println(name+ ": melihat idola nya dari youtube");
	}
	public void watchingPerformance(Musician musician){
		System.out.println(name+ ": melihat idolanya "+ musician.perform());
	}

	public String getName(){
		return name;	
	}
}
