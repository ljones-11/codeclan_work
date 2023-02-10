public class Pilot {

    private String name;
    private String licenseNumber;

    private Rank rank;

    public Pilot(String name, Rank rank, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rank = rank;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Rank getRank() {
        return this.rank;
    }
}
