package designpatterns.creational.builder.phone;

public class PhoneBuilder {

    private String phoneOS;
    private String phoneManufacturer;
    private int batteryCapacity;
    private int phoneIMEI;
    private String countryOfOrigin;

    public PhoneBuilder withPhoneOS(String os){
        this.phoneOS = os;
        return this;
    }

    public PhoneBuilder withPhoneManufacturer(String phoneManufacturer){
        this.phoneManufacturer  =  phoneManufacturer;
        return this;
    }

    public PhoneBuilder withBatteryCapacity(int batteryCapacity){
        this.batteryCapacity  =  batteryCapacity;
        return this;
    }

    public PhoneBuilder withPhoneIMEI(int phoneIMEI){
        this.phoneIMEI  =  phoneIMEI;
        return this;
    }

    public PhoneBuilder withCountryOfOrigin(String countryOfOrigin){
        this.countryOfOrigin  =  countryOfOrigin;
        return this;
    }

    public Phone build(){
        return new Phone(phoneOS, phoneManufacturer, batteryCapacity, phoneIMEI, countryOfOrigin);
    }
}
