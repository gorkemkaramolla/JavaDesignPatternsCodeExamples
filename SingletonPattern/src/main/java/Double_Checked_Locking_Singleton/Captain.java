package Double_Checked_Locking_Singleton;
final class Captain {
    private static Captain captain;
    static int numberOfInstances = 0;

    private Captain() {
        numberOfInstances++;
        System.out.println("Number of Instances right now = " + numberOfInstances);
    }

    public static Captain getCaptain() {
        if (captain == null) {

            synchronized (Captain.class) {
                if (captain == null)
                {
                    captain = new Captain();
                    System.out.println("New Captain Elected for your team");
                }
            }

        }
        else{
            System.out.println("You already have a captain use him");
        }
        return captain;
    }
    public static void dummy()
    {
        System.out.println("Dummy method");
    }
}

