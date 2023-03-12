public class DokumenKK {
  private String reason;
  private String prevIdNumber;
  private String name;
  private String NIK;
  private String phoneNumber;
  private String address;
  private int totalFamilyMember;

  public DokumenKK(String reason, String prevIdNumber, String name, String NIK, String phoneNumber, String address, int totalFamilyMember) {
    this.reason = reason;
    this.prevIdNumber = prevIdNumber;
    this.name = name;
    this.NIK = NIK;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.totalFamilyMember = totalFamilyMember;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }

  public void setPrevIdNumber(String prevIdNumber) {
    this.prevIdNumber = prevIdNumber;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNIK(String nIK) {
    NIK = nIK;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setAddress(String address) {
    this.address = address;
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

  public String getName() {
    return name;
  }

  public String getNIK() {
    return NIK;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getAddress() {
    return address;
  }

  public int getTotalFamilyMember() {
    return totalFamilyMember;
  }

  public DokumenKK() {}
}
