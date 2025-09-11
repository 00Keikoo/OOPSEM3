import sekolah.Kelas;
import sekolah.Mahasiswa;

public class Test{
	public static void main(String[] args){
		Mahasiswa mhs =new Mahasiswa(12345, "Dika");
		Kelas.setMhs(mhs);
	}
}
