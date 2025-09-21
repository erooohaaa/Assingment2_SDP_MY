import client.Client;
import factory.XiaomiFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Xiaomi phones:");
        Client client = new Client(new XiaomiFactory());
        client.showPhones();
    }
}
