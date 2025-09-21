package product;

public class RegularPhone implements Phone {
    private final String model;
    private final int ram;
    private final String processor;
    private final int battery;
    private final double price;

    public RegularPhone(String model, int ram, String processor, int battery, double price) {
        this.model = model;
        this.ram = ram;
        this.processor = processor;
        this.battery = battery;
        this.price = price;
    }

    @Override
    public String getModel() { return model; }
    @Override
    public int getRam() { return ram; }
    @Override
    public String getProcessor() { return processor; }
    @Override
    public int getBattery() { return battery; }
    @Override
    public double getPrice() { return price; }
}
