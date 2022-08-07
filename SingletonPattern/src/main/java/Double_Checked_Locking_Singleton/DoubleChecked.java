package Double_Checked_Locking_Singleton;

public class DoubleChecked {
    public static void main(String[] args) {
        Captain.dummy();
        System.out.println("DOUBLE CHECKED SINGLETON\n\n");
        System.out.println("Trying to make a captain for you team");
        Captain captain  =  Captain.getCaptain();
        System.out.println("Trying to make another captain for you");
        Captain captain1 = Captain.getCaptain();


    }
}
