public class Dokumen {
  private String NIK;
  private String name;
  private String address;

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

  public void description() {
    System.out.println("Harap sesuaikan berkas yang ingin diajukan!");
  }

  public void description(boolean isApprove) {
    if(isApprove) {
      System.out.println("Apabila berkas yang diajukan sudah diterima, harap segera datang ke disdukcapil terdekat");
    } else {
      System.out.println("Apabila pengajuan berkas ditolak, harap melakukan pengajuan ulang setelah 24 Jam");
    }
  }
}
