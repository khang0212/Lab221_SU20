package j1.s.p0052;

public class EastAsiaCountry {

    protected String countryCode;
    protected String countryName;
    protected float totalArea;

    public EastAsiaCountry() {
    }

    public EastAsiaCountry(String countryCode, String countryName, float totalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    public String display() {
        return String.format("%-20s%-20s%-20.0f",
                countryCode,
                countryName,
                totalArea);
    }

}
