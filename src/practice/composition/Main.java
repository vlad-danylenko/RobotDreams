package src.practice.composition;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(13,05,1997);
        Client client = new Client("Владислав","Даниленко", data);

        System.out.println(client.getClientInfo());
        System.out.println(data);
    }
}
