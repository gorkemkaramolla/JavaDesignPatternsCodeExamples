package Bill_Pugh_Initializaiton_Singleton;

public class BillPughSingleton {
    public BillPughSingleton() {
    }

    public static void main(String[] args) {
        Captain.dummy();
        System.out.println("Trying to make a captain for your team");
        Captain captain = Captain.getCaptain();
        System.out.println("Trying to make another captain for your team");
        Captain captain1 = Captain.getCaptain();

        if (captain.equals(captain1)) {
            System.out.println("Your Captain instances are same");
        }

    }
}