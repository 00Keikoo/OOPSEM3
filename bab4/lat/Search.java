class Search{
	public static void main(String args[]){
		int n=12;
		int[][] arrayOfInts = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 },  
 { 622, 127, 77, 955 }};
		for(int i=0;i<arrayOfInts.length;i++){
			for(int j=0; j<arrayOfInts[i].length;j++){
				if(n != arrayOfInts[i][j]){
					continue;
				}else{
					System.out.println("Found "+n+ " at "+ i +", "+j );
				}
			}
		}
	}
}
