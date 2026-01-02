package aimane.maane;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();

        client.setStandard(new Proxy());
        client.process();

//        client.setStandard(new StandardImpl2());
//        client.process();
    }
}