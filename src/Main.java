import client.Client;
import factory.AppleFactory;
import factory.XiaomiFactory;

public class Main {
    public static void main(String[] args) {

        Client xiaomiClient = new Client(new XiaomiFactory());
        xiaomiClient.showProducts();


        Client appleClient = new Client(new AppleFactory());
        appleClient.showProducts();
    }
}