public class DokumenKK {
  String reason;
  String prevIdNumber;
  String name;
  String NIK;
  String phoneNumber;
  String address;
  int totalFamilyMember;

  public DokumenKK(String reason, String prevIdNumber, String name, String NIK, String phoneNumber, String address, int totalFamilyMember) {
    this.reason = reason;
    this.prevIdNumber = prevIdNumber;
    this.name = name;
    this.NIK = NIK;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.totalFamilyMember = totalFamilyMember;
  }

  public DokumenKK() {}
}
