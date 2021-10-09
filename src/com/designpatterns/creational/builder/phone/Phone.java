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

    private Phone(PhoneBuilder builder) {
        phoneOS = builder.phoneOS;
        phoneManufacturer = builder.phoneManufacturer;
        batteryCapacity = builder.batteryCapacity;
        phoneIMEI = builder.phoneIMEI;
        countryOfOrigin = builder.countryOfOrigin;
    }
    public static class PhoneBuilder {

        private String phoneOS;
        private String phoneManufacturer;
        private int batteryCapacity;
        private int phoneIMEI;
        private String countryOfOrigin;

        public PhoneBuilder(int imei){
            this.phoneIMEI = imei;
        }

        public PhoneBuilder withPhoneManufacturer(String phoneManufacturer){
            this.phoneManufacturer  =  phoneManufacturer;
            return this;
        }

        public PhoneBuilder withBatteryCapacity(int batteryCapacity){
            this.batteryCapacity  =  batteryCapacity;
            return this;
        }

        public PhoneBuilder withPhoneOS(String phoneOS){
            this.phoneOS  =  phoneOS;
            return this;
        }

        public PhoneBuilder withCountryOfOrigin(String countryOfOrigin){
            this.countryOfOrigin  =  countryOfOrigin;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
}
    @Override
    public String toString() {
        return  "Phone [os="+ this.phoneOS + ", batterCapacity=" + batteryCapacity + ", phoneIMEI=" + phoneIMEI +
                ", phoneManufacturer=" + phoneManufacturer + ", phoneOrigin=" + countryOfOrigin + "]";
    }
}
