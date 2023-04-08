public abstract class Dokumen implements DokumenInterface {
  private String NIK;
  private String name;
  private String address;

  public abstract void description();
  public Dokumen(String NIK, String name, String address) {
    this.name = name;
    this.NIK = NIK;
    this.address = address;
  }

  public Dokumen() {}

  public void setName(String name) {
    this.name = name;
  }

  public void setNIK(String nIK) {
    NIK = nIK;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public String getNIK() {
    return NIK;
  }

  public String getAddress() {
    return address;
  }

  public void description(boolean isApprove) {
    if(isApprove) {
      System.out.println("Apabila berkas yang diajukan sudah diterima, harap segera datang ke disdukcapil terdekat");
    } else {
      System.out.println("Apabila pengajuan berkas ditolak, harap melakukan pengajuan ulang setelah 24 Jam");
    }
  }

  public static void about() {
    System.out.println("Disdukcapil adalah unsur pelaksana yang menyelenggarakan urusan pemerintahan bidang kependudukan dan pencatatan sipil.");
    System.out.println("\nKartu Tanda Penduduk (KTP):\nidentitas resmi penduduk sebagai bukti diri yang diterbitkan oleh Kementerian Dalam Negeri yang berlaku di seluruh wilayah Negara Kesatuan Republik Indonesia.");
    System.out.println("\nKartu Keluarga (KK):\nKartu Identitas Keluarga yang memuat data tentang susunan, hubungan dan jumlah anggota keluarga.");
  }
}
