public class DokumenKTP extends Dokumen {
  private String birthPlaceDate;
  private String gender;
  private String job;
  private String nationality;
  
  public DokumenKTP(String name, String NIK, String birthPlaceDate, String gender, String address, String job, String nationality) {
    super(NIK, name, address);
    this.birthPlaceDate = birthPlaceDate;
    this.gender = gender;
    this.job = job;
    this.nationality = nationality;
  }

  public DokumenKTP() {}

  public void setBirthPlaceDate(String birthPlaceDate) {
    this.birthPlaceDate = birthPlaceDate;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
  public void setJob(String job) {
    this.job = job;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public String getBirthPlaceDate() {
    return birthPlaceDate;
  }

  public String getGender() {
    return gender;
  }

  public String getJob() {
    return job;
  }

  public String getNationality() {
    return nationality;
  }
}
