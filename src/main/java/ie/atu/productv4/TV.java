package ie.atu.productv4;

import ie.atu.productv4.Product;
public class TV {

    private String screenSize;
    private String manufacturer;

    public TV() {
        super();
        screenSize = "";
        manufacturer = "";
    }

    public String getScreenSize() { return screenSize; }

    public void setScreenSize(String screenSize) { this.screenSize = screenSize; }

    public String getManufacturer() { return manufacturer; }

    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    @Override
    public String toString() {
        return super.toString() + "screenSize='" + screenSize + '\'' +
                ", manufacturer='" + manufacturer;
    }
}
