package factory;

import product.Phone;

public interface AbstractPhoneFactory {
    Phone createGamingPhone();
    Phone createRegularPhone();
}
