public class Battle {
    public static void startFight(Warrior w1, Warrior w2) throws InterruptedException {
        // Loop giving each a chance to attack
        // and block
        while (true) {
            if (getAttackResult(w1, w2).equals("Game Over")) {
                System.out.println("Game Over");
                break;
            }
            if (getAttackResult(w2, w1).equals("Game Over")) {
                System.out.println("Game Over");
                break;
            }
        }
    }


    public static String getAttackResult(Warrior wA, Warrior wB) throws InterruptedException {
        // Get warriors attack and block
        int wAAttkAmt = wA.attack();
        int wBBlockAmt = wB.block();

        // Subtract block from attack
        int dmg2WarB = wAAttkAmt - wBBlockAmt;

        // If damaged subtract damage from health
        if (dmg2WarB > 0) {
            wB.health = wB.health - dmg2WarB;
        } else dmg2WarB = 0;

        // Print out a damage report
        // printf is for formatted output
        // %s : Strings
        // %d : Integers
        // %f : Floats / Doubles
        // %.2f : To limit to 2 decimals
        // %c : Characters
        // %e : Scientific Notation
        // %t : Dates
        // %b : Booleans
        System.out.printf("%s Attacks %s and deals "
                        + "%d Damage\n", wA.getName(),
                wB.getName(), dmg2WarB);

        // Output health changes
        System.out.printf("%s Has %d Health\n\n",
                wB.getName(), wB.health);

        // Pauses execution for 1500 milliseconds
        Thread.sleep(1500);

        // Check if health fell below 0
        if (wB.health <= 0) {
            System.out.printf("%s has Died and %s is "
                            + "Victorious\n", wB.getName(),
                    wA.getName());
            return "Game Over";
        } else return "Fight Again";
    }
}
