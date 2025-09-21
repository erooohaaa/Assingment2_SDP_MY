package factory;

import product.Phone;

public interface PhoneFactory {
    Phone createGamingPhone();
    Phone createRegularPhone();
}
