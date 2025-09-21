package factory;

import product.GamingPhone;
import product.Phone;
import product.RegularPhone;

public class PhoneFactory {
    public static Phone createPhone(String type) {
        if (type.equalsIgnoreCase("gaming")) {
            return new GamingPhone("Xiaomi Black Shark", 16, "Snapdragon 8+ Gen 1", 6500, 999.99);
        } else if (type.equalsIgnoreCase("regular")) {
            return new RegularPhone("Xiaomi Redmi Note 11", 4, "Snapdragon 680", 5000, 249.99);
        }
        throw new IllegalArgumentException("Unknown phone type: " + type);
    }
}
