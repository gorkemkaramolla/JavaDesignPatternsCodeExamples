final class Captain {
    //Constructor is private to prevent create a new instance from another class (with "new" keyword)

    private Captain(){
    }
    private static Captain captain;

    static synchronized Captain getCaptain()
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
}
