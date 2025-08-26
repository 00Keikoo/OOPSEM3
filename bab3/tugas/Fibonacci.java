import javax.swing.JOptionPane;
class Fibonacci{
	public static void main(String args[]){
		String str = JOptionPane.showInputDialog("Masukkan berapa deret Fibonacci : ");
		int n = Integer.parseInt(str);
		int a=0;
		int b=1;
		int sum = 0;
		System.out.print(" "+ b);
		for(int i = 0; i <n; i++){
			sum = a+b;
			a=b;
			b=sum;
			System.out.print(" " + sum);
		}
	}
}
