package Bill_Pugh_Initializaiton_Singleton;

public class Captain {
    private Captain() {
        System.out.println("Your captain is elected");
    }

    public static Captain getCaptain() {
        return Captain.SingletonHelper.captain;
    }

    public static void dummy() {
        System.out.println("Dummy print");
    }

    private static class SingletonHelper {
        private static final Captain captain = new Captain();

        private SingletonHelper() {
        }
    }
}