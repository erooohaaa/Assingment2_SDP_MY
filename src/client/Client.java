package client;

import factory.AbstractPhoneFactory;
import product.Phone;

public class Client {
    private final AbstractPhoneFactory factory;

    public Client(AbstractPhoneFactory factory) {
        this.factory = factory;
    }

    public void showPhones() {
        Phone gaming = factory.createGamingPhone();
        Phone regular = factory.createRegularPhone();

        gaming.displayInfo();
        regular.displayInfo();
    }
}
