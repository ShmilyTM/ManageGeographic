package model;

public class Country {

    private String countryCode;
    private String countryName;
    private double totalArea;

    public Country() {
    }

    public Country(String countryCode, String countryName, double totalArea) {
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

    public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }
}
