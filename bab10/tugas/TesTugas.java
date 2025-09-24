import java.text.NumberFormat;
import java.util.Locale;
import kendaraan.*;
public class TesTugas {
	public static void main(String[] args) {
		NumberFormat usFormat = NumberFormat.getNumberInstance(Locale.US);
		//Truk 1
		Truk truk1 = new Truk(4, "kuning" , "solar" , 1500 , 1000);
		System.out.println("=================================");
		System.out.println("Class truk1:");
		System.out.println("Jumlah Roda : " + truk1.getJmlRoda() + " Roda");
		System.out.println("Warna : " + truk1.getWarna());
		System.out.println("Bahan Bakar : " + truk1.getBahanBakar());
		System.out.println("Kapaitas Mesin : " +
				usFormat.format(truk1.getKapasitasMesin()).replace(',','.') + " cc");
		System.out.println("Muatan Maksimal: " +
				usFormat.format(truk1.getMuatanMaks()).replace(',','.') + " kg");
		//Truk 2
		Truk truk2 = new Truk(6, "merah" , "solar" , 2000 , 5000);
		System.out.println("=================================");
		System.out.println("Class truk2:");
		System.out.println("Jumlah Roda : " + truk2.getJmlRoda() + " Roda");
		System.out.println("Warna : " + truk2.getWarna());
		System.out.println("Bahan Bakar : " + truk2.getBahanBakar());
		System.out.println("Kapaitas Mesin : " +
				usFormat.format(truk2.getKapasitasMesin()).replace(',','.') + " cc");
		System.out.println("Muatan Maksimal: " +
				usFormat.format(truk2.getMuatanMaks()).replace(',','.') + " kg");
		//Taksi 1
		Taksi taksi1 = new Taksi(4, "oranye" , "bensin" , 1500 , 10000, 5000);
		System.out.println("=================================");
		System.out.println("Class taksi1:");
		System.out.println("Jumlah Roda : " + taksi1.getJmlRoda() + " Roda");
		System.out.println("Warna : " + taksi1.getWarna());
		System.out.println("Bahan Bakar : " + taksi1.getBahanBakar());
		System.out.println("Kapaitas Mesin : " +
				usFormat.format(taksi1.getKapasitasMesin()).replace(',','.') + " cc");
		System.out.println("Tarif Awal : Rp" +
				usFormat.format(taksi1.getTarifAwal()).replace(',','.'));
		System.out.println("Tarif Per KM : Rp" +
				usFormat.format(taksi1.getTarifPerKm()).replace(',','.'));
		//Taksi 2
		Taksi taksi2 = new Taksi(4, "biru" , "bensin" , 1300 , 7000, 3500);

		System.out.println("=================================");
		System.out.println("Class taksi2:");
		System.out.println("Jumlah Roda : " + taksi2.getJmlRoda() + " Roda");
		System.out.println("Warna : " + taksi2.getWarna());
		System.out.println("Bahan Bakar : " + taksi2.getBahanBakar());
		System.out.println("Kapaitas Mesin : " +
				usFormat.format(taksi2.getKapasitasMesin()).replace(',','.') + " cc");
		System.out.println("Tarif Awal : Rp" +
				usFormat.format(taksi2.getTarifAwal()).replace(',','.'));
		System.out.println("Tarif Per KM : RP" +
				usFormat.format(taksi2.getTarifPerKm()).replace(',','.'));
		//Sepeda 1
		Sepeda sepeda1 = new Sepeda(3, "hitam" , 1, 2);
		System.out.println("=================================");
		System.out.println("Class sepeda1:");
		System.out.println("Jumlah Roda : " + sepeda1.getJmlRoda() + " Roda");
		System.out.println("Warna : " + sepeda1.getWarna());
		System.out.println("Jumlah Sadel : " + sepeda1.getJmlSadel());
		System.out.println("Jumlah Gir : " + sepeda1.getJmlGir());
		//Sepeda 2
		Sepeda sepeda2 = new Sepeda(2, "putih" , 2, 5);
		System.out.println("=================================");
		System.out.println("Class sepeda2:");
		System.out.println("Jumlah Roda : " + sepeda2.getJmlRoda() + " Roda");
		System.out.println("Warna : " + sepeda2.getWarna());
		System.out.println("Jumlah Sadel : " + sepeda2.getJmlSadel());
		System.out.println("Jumlah Gir : " + sepeda2.getJmlGir());
	}
}
