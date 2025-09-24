package product;

public interface Phone {
    String getModel();
    int getRam();
    String getProcessor();
    int getBattery();
    double getPrice();

    default void displayInfo() {
        System.out.println(
                getModel() + " | " +
                        "RAM: " + getRam() + "GB, " +
                        "Processor: " + getProcessor() + ", " +
                        "Battery: " + getBattery() + "mAh, " +
                        "Price: $" + getPrice()
        );
    }
}