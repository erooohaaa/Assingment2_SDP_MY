package client;

import factory.PhoneFactory;
import product.Phone;
import product.Charger;

public class Client {
    private final PhoneFactory factory;

    public Client(PhoneFactory factory) {
        this.factory = factory;
    }

    public void showProducts() {
        System.out.println("=== " + factory.getBrand() + " Products ===");

        Phone gaming = factory.createGamingPhone();
        Phone regular = factory.createRegularPhone();
        Charger charger = factory.createCharger();

        System.out.println("\n📱 Gaming Phone:");
        gaming.displayInfo();

        System.out.println("\n📱 Regular Phone:");
        regular.displayInfo();

        System.out.println("\n🔌 Charger:");
        charger.displayInfo();

        System.out.println("----------------------------------------\n");
    }
}