class Genap{
	public static void main(String args[]){
		int n = 20;
		int i;
		for(i=2;i<=n;i+=2){
			if(i % 6 == 0)continue;
			System.out.print(" " + i);
		}
	}
}
