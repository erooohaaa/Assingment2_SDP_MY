package factory;

import product.Phone;
import product.Charger;

public interface PhoneFactory {
    Phone createGamingPhone();
    Phone createRegularPhone();
    Charger createCharger();
    String getBrand();
}