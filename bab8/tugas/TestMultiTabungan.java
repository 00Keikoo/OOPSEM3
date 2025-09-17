public class TestMultiTabungan{
	public static void main(String[] args){
		boolean status;
		MultiTabungan tabungan1 = new MultiTabungan(50000);
		System.out.println("Saldo anda : " + tabungan1.getSaldo());

		System.out.println("Simpan uang dalam IDR: 10000");
		tabungan1.simpanUang(10000, "idr");
		System.out.println("Total Saldo: "+ tabungan1.getSaldo());

		System.out.println("Simpan uang dalam USD: 2");
		tabungan1.simpanUang(2, "usd");
		System.out.println("Total Saldo: "+ tabungan1.getSaldo());

		System.out.println("Simpan uang dalam AUD: 3");
		status =tabungan1.ambilUang(3, "aud");
		if(status){
			System.out.println("OK");
		}else{
			System.out.println("Gagal");
		}
		System.out.println("Total Saldo: "+ tabungan1.getSaldo());

		System.out.println("Ambil uang dalam IDR: 15000");
		status=tabungan1.ambilUang(15000, "IDR");

		if(status){
			System.out.println("OK");
		}else{
			System.out.println("Gagal");
		}
		System.out.println("Total Saldo: "+ tabungan1.getSaldo());
	}
}
