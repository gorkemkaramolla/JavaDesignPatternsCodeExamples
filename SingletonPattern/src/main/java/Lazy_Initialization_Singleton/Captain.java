package Lazy_Initialization_Singleton;

//final class
class Captain {
    //Constructor is private to prevent create a new instance from another class (with "new" keyword)
    static int numberofInstances = 0;
    private Captain(){
        numberofInstances++;
        System.out.println("number of instances = "+numberofInstances);
    }
    private static Captain captain;

    public static synchronized   Captain getCaptain()
    {
        //lazy Initialization
        if(captain == null)
        {
            captain = new Captain();
            System.out.println("New Captain is elected for your team");

        }
        else
        {
            System.out.println("You already have a captain send him for a toss");
        }
        return captain;
    }
    //If you make captain class final you prevent inheriting from this class

    public class CaptainDerived extends Captain{
        static void CaptainDerived()
        {
            System.out.println("captain derived");
        }

    }
}
