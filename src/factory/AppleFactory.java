package factory;

import product.*;

public class AppleFactory implements PhoneFactory {
    @Override
    public Phone createGamingPhone() {
        return new GamingPhone("iPhone 15 Pro Max", 8, "A17 Pro", 4422, 1299.99);
    }

    @Override
    public Phone createRegularPhone() {
        return new RegularPhone("iPhone 15", 6, "A16 Bionic", 3349, 799.99);
    }

    @Override
    public Charger createCharger() {
        return new StandardCharger("Lightning", 20);
    }

    @Override
    public String getBrand() {
        return "Apple";
    }
}