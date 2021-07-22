package designpatterns.creational.builder.phone;

public class PhoneClient {

    public static void main(String... args){

        Phone phone = new PhoneBuilder().withPhoneOS("iOS").
                                         withCountryOfOrigin("USA").
                                         withPhoneManufacturer("Google").
                                         withBatteryCapacity(3500).
                                         withPhoneIMEI(54321).build();

        System.out.println(phone.toString());

    }
}
