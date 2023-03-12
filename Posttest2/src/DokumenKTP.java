public class DokumenKTP {
  private String name;
  private String NIK;
  private String birthPlaceDate;
  private String gender;
  private String address;
  private String job;
  private String nationality;

  public DokumenKTP(String name, String NIK, String birthPlaceDate, String gender, String address, String job, String nationality) {
    this.name = name;
    this.NIK = NIK;
    this.birthPlaceDate = birthPlaceDate;
    this.gender = gender;
    this.address = address;
    this.job = job;
    this.nationality = nationality;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNIK(String NIK) {
    this.NIK = NIK;
  }

  public void setBirthPlaceDate(String birthPlaceDate) {
    this.birthPlaceDate = birthPlaceDate;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public String getName() {
    return name;
  }

  public String getNIK() {
    return NIK;
  }

  public String getBirthPlaceDate() {
    return birthPlaceDate;
  }

  public String getGender() {
    return gender;
  }

  public String getAddress() {
    return address;
  }

  public String getJob() {
    return job;
  }

  public String getNationality() {
    return nationality;
  }

  public DokumenKTP() {}
}
