package j1.s.p0052;

public class Country extends EastAsiaCountry {

    private String countryTerrain;

    public Country() {
    }

    public Country(String countryTerrain, String countryCode, String countryName, float totalArea) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public Country(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public void Display() {
        System.out.printf("%-20s%-20s%-20.0f%-20s\n", super.countryCode, super.countryName,
                 super.totalArea, countryTerrain);
    }

}
