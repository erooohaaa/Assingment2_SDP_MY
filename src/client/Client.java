package client;

import factory.PhoneFactory;
import product.Phone;

public class Client {
    private final PhoneFactory factory;

    public Client(PhoneFactory factory) {
        this.factory = factory;
    }

    public void showPhones() {
        System.out.println(factory.getBrand() + " phones:");
        Phone gaming = factory.createGamingPhone();
        Phone regular = factory.createRegularPhone();

        gaming.displayInfo();
        regular.displayInfo();
    }
}
