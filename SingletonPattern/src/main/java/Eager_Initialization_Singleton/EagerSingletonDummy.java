package Eager_Initialization_Singleton;

public class EagerSingletonDummy {
    public static void main(String[] args) {
        System.out.println("Eager Implementation Singleton\n\n");
        Captain.dummyMethod();
        System.out.println("Trying to make a captain for your team:");

        Captain captain1 = Captain.getCaptain();
        System.out.println("Trying to make another captain for your team:");
        Captain captain2 = Captain.getCaptain();

        if(captain1.equals(captain2))
        {
            System.out.println("Captain 1  and Captain2 are same instances");
        }
    }
}

