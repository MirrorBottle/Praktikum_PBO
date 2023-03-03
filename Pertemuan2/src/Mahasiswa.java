
public class Mahasiswa {
  String nama;
  int nim;
  double ipk;

  public Mahasiswa(String nama, int nim, double ipk) {
    this.nama = nama;
    this.nim = nim;
    this.ipk = ipk;
  }

  public Mahasiswa() {}
  public void registrasi() {
    System.out.println("Berhasil terdaftar di SIA");
  }
}
