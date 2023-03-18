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
}
