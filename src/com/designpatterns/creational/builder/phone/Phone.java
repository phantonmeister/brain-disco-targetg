package designpatterns.creational.builder.phone;

public class Phone {

    private String phoneOS;
    private String phoneManufacturer;
    private int batteryCapacity;
    private int phoneIMEI;
    private String countryOfOrigin;

    public String getPhoneOS() {
        return phoneOS;
    }

    public String getPhoneManufacturer() {
        return phoneManufacturer;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getPhoneIMEI() {
        return phoneIMEI;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public Phone(String phoneOS, String phoneManufacturer, int batteryCapacity, int phoneIMEI, String countryOfOrigin) {
        this.phoneOS = phoneOS;
        this.phoneManufacturer = phoneManufacturer;
        this.batteryCapacity = batteryCapacity;
        this.phoneIMEI = phoneIMEI;
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return  "Phone [os="+ phoneOS + ", batterCapacity=" + batteryCapacity + ", phoneIMEI=" + phoneIMEI +
                ", phoneManufacturer=" + phoneManufacturer + ", phoneOrigin=" + countryOfOrigin + "]";
    }
}
