import pegawai.*;

public class Main{
	public static void main(String[] args){
		System.out.println("===DEMO INSTANCEOF PEGAWAI===");
		System.out.println();

		// Kotak Pegawai, isi Campur!
		Pegawai p1 = new Manajer("Budi");
		Pegawai p2 = new Programmer("Ani");
		Pegawai p3 = new Manajer("Doni");

		//TEST1: Kasih hadiah pakai instanceof
		System.out.println("---KASIH HADIAH---");
		kasihHadiah(p1);
		kasihHadiah(p2);
		kasihHadiah(p3);
		System.out.println();

		//TEST2: Lihat tipe sebenarnya
		System.out.println("---CEK TIPE SEBENARNYA---");
		System.out.println("p1 instanceof Manajer?"+ (p1 instanceof Manajer));
		System.out.println("p2 instanceof Programmer?"+ (p2 instanceof Programmer));
		System.out.println("p3 instanceof Pegawai?"+ (p1 instanceof Pegawai));

	}

	static void kasihHadiah(Pegawai p){
		if(p instanceof Manajer)
			System.out.println(" Hadiah "+p.nama + "Bonus 5jt");
		else if(p instanceof Programmer)
			System.out.println("Kopi"+p.nama+ "Kopi Gratis!");
		else
			System.out.println("Senyum"+ p.nama+ "Dapat senyum");
	}
}
