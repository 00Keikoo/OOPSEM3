import javax.swing.JOptionPane;
class Faktorial{
	public static void main(String args[]){
		int faktor= 0;
		int sum = 1;
		String str = JOptionPane.showInputDialog("Masukkan nilai : ");
		faktor = Integer.parseInt(str);
		System.out.println("n	 n!");
		System.out.println("---------");
		for(int i= 1; i<=faktor; i++){
			sum *=i;
			System.out.println("" + i + "	" + sum);
		}
	}
}
