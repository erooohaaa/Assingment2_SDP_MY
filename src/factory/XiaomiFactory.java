package factory;

import product.*;

public class XiaomiFactory implements PhoneFactory {
    @Override
    public Phone createGamingPhone() {
        return new GamingPhone("Xiaomi Black Shark", 16, "Snapdragon 8+ Gen 1", 6500, 999.99);
    }

    @Override
    public Phone createRegularPhone() {
        return new RegularPhone("Xiaomi Redmi Note 11", 4, "Snapdragon 680", 5000, 249.99);
    }
}
