package Lazy_Initialization_Singleton;

public class SingletonPatternExample {
    public static void main(String[] args) {
        System.out.println("**** Singleton Pattern Demo ****");
        System.out.println();
        System.out.println("Trying to make a captain for your team");

        //Constructor is private.We cannot use "new" here.
        //Captain c3 = new Captain();
        // error

        Captain captain1 = Captain.getCaptain();

        System.out.println("Trying to make another captain for your team:");

        Captain captain2 = Captain.getCaptain();
        if (captain1 == captain2)
        {
            System.out.println("captain1 and captain2 are same instance.");
        }
        //We create an instance of nested CaptainDerived class by using captain1 object
        //The lazy initialization of SingletonClass increase numberOfInstances of Captain class

        Captain.CaptainDerived derived = captain1.new CaptainDerived();
    }
}
