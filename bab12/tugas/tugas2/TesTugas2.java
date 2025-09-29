public class TesTugas2 { 
	public static void main(String[] args) { 
		Katak O1 = new Katak(5, "Froggy"); 
		Kecebong O2 = new Kecebong(2, "Junior Frog", 10); 
		System.out.println("Objek O1"); 
		System.out.println("Umur: " + O1.umur); 
		System.out.println("Nama: " + O1.nama); 
		System.out.println("Cara Bergerak: " + O1.caraBergerak());  System.out.println(); 
		System.out.println("Objek O2"); 
		System.out.println("Umur: " + O2.umur); 
		System.out.println("Nama: " + O2.nama); 
		System.out.println("Panjang Ekor: " + O2.panjangEkor);  System.out.println("Cara Bergerak: " + O2.caraBergerak());  System.out.println(); 
	} 
} 

