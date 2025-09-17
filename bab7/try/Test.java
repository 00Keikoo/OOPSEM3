import sekolah.*;;

public class Test{
	public static void main(String[] args){
		Mahasiswa mhs =new Mahasiswa(12345, "Dika");
		Kelas kelas = new Kelas(101, "PBO");
		kelas.setMhs(mhs);
	}
}
