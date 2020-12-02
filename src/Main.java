public class Main {

    public static void main(String[] args) {

        Government gov = Government.getInstance();
        gov.party = "demo party";

        System.out.println(gov.party);

        Government gov2 = Government.getInstance();
        System.out.println(gov2.party);
    }

}
