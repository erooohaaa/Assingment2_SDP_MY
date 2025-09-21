import client.Client;
import factory.XiaomiFactory;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new XiaomiFactory());
        client.showPhones();
    }
}
