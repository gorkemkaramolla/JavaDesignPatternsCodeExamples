package Eager_Initialization_Singleton;

public class Captain {
    //Early Initialization
    private static final Captain captain = new Captain();
    private Captain(){
        System.out.println("A captain is selected for your team");
    }

    public static Captain getCaptain()
    {

        System.out.println("You already have a captain for your team.");
        return captain;
    }

    public static void dummyMethod() {
        System.out.println("It is a dummy");
    }
}
