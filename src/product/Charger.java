package product;

public interface Charger {
    String getType();
    int getWattage();
    boolean isFastCharging();

    default void displayInfo() {
        System.out.println(
                "Charger: " + getType() + " | " +
                        getWattage() + "W" +
                        (isFastCharging() ? " (Fast Charging)" : "")
        );
    }
}