package designpatterns.creational.builder.phone;

public class PhoneClient {

    public static void main(String... args){

        Phone phone = new Phone.PhoneBuilder(54321).withPhoneOS("iOS").
                                         withCountryOfOrigin("USA").
                                         withPhoneManufacturer("Google").
                                         withBatteryCapacity(3500).build();

        System.out.println(phone.toString());

    }
}
