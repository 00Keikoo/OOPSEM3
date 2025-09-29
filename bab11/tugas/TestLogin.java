import user.*;

public class TestLogin{
	public static void main(String[] args){
		Mahasiswa fadilah = new Mahasiswa("fadilah", "123456", "08385501388", "D4 IT D");

		boolean result = fadilah.login("fadilah", "123456");

		System.out.println(result ? "Login berhasil" : "Login gagal");

		Dosen fahrul = new Dosen("fahrul", "123456", 19990129);
		result = fahrul.login("fahrul", "123456", 19990129);

		System.out.println(result ? "Login berhasil" : "Login gagal");
	}
}
