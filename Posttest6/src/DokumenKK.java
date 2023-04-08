public class DokumenKK extends Dokumen {
  private String reason;
  private String prevIdNumber;
  private String phoneNumber;
  private int totalFamilyMember;

  public DokumenKK(String reason, String prevIdNumber, String name, String NIK, String phoneNumber, String address, int totalFamilyMember) {
    super(NIK, name, address);
    this.reason = reason;
    this.prevIdNumber = prevIdNumber;
    this.phoneNumber = phoneNumber;
    this.totalFamilyMember = totalFamilyMember;
  }

  public DokumenKK() {}


  public void setReason(String reason) {
    this.reason = reason;
  }

  public void setPrevIdNumber(String prevIdNumber) {
    this.prevIdNumber = prevIdNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setTotalFamilyMember(int totalFamilyMember) {
    this.totalFamilyMember = totalFamilyMember;
  }

  public String getReason() {
    return reason;
  }

  public String getPrevIdNumber() {
    return prevIdNumber;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public int getTotalFamilyMember() {
    return totalFamilyMember;
  }

  @Override public void description() {
    System.out.println("Berkas yang perlu dibawa ke disdukcapil:\n1.KK Lama (Apabila hilang maka surat keterangan hilang)\n2.Surat pengantar dari desa/kelurahan");
  }

  @Override public void description(boolean isApprove) {
    if(isApprove) {
      System.out.println("Untuk melakukan pengajuan pengganti KK. harap datangi disdukcapil terdekat dengan membawa berkas yang diperlukan");
    } else {
      System.out.println("Pengajuan Pengajuan Penggnti KK hanya bisa dilakukan 1x per minggu!");
    }
  }

}
