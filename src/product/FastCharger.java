package product;

public class FastCharger implements Charger {
    private final String type;
    private final int wattage;

    public FastCharger(String type, int wattage) {
        this.type = type;
        this.wattage = wattage;
    }

    @Override public String getType() { return type; }
    @Override public int getWattage() { return wattage; }
    @Override public boolean isFastCharging() { return true; }
}