import java.util.Scanner;
import java.util.Random;
public class fightLoops {
    // figure out how to
    public static void main(String[] args) {
        // boolean playerIsAlive = true;
        int playerHealth = 5;
        int enemyHealth = 100;
        int kick = 1; // 1consistent damage
        int punch = 2; //multiplied by strength
        int tackle = 5; //multiplied by health
        int playerInput;
        int enemyInput;
        Scanner input = new Scanner(System.in);

//player attacking
        for (boolean playerIsAlive = true; playerIsAlive;) {
            StartFights();

            playerInput = input.nextInt(); // attack choice

            // PlayerAttacking(playerInput, enemyHealth, kick, punch, tackle);
            if (playerInput == 1) {
                enemyHealth = enemyHealth - kick;
            }
            if (playerInput == 2) {
                enemyHealth = enemyHealth - punch;

            }
            if (playerInput == 3) {
                enemyHealth = enemyHealth - tackle;


            } else {
                System.out.println("Nothing happens, you didn't do it right");
            }



            Random rand = new Random();

            enemyInput = rand.nextInt((3 - 1) + 1) + 1;

            if (enemyInput == 1) {
                playerHealth = playerHealth - kick;
            }
            if (enemyInput == 2) {
                playerHealth = playerHealth - punch;

            }
            if (enemyInput == 3) {
                playerHealth = playerHealth - tackle;


            } else {
                System.out.println("Nothing happens, you didn't do it right");

            }
            System.out.println(enemyHealth);
            System.out.println(playerHealth);

            //make theese two if statements methods

            if(playerHealth<=0) {
                playerIsAlive = false;
                DeathMessage();
            }
            if(enemyHealth < 0) {
                playerIsAlive = false;
            }
        }

        //EnemyAttacking(enemyInput, playerHealth, kick, punch, tackle);

        //DeathMessage();//        ***add player name to print out and parameters***

    }




    //**************************************************List of Functions*****************************************************************
    //prints text based on character death
    public static void DeathMessage () {
        System.out.println("You've  reached the end of your line... BOOM!");

    }
    public static void StartFights () {
        System.out.println("""
                     please enter 1,2 or 3 key to attack\s
                    Quickly what would you like to do\s
                    Kick: 1\s
                    Punch: 2 \s
                    Tackle: 3""");

    }
    // public static void NothingHappens () {
    //System.out.println("Nothing happens, you didn't do it right");
    //}
//player attacking,
/*        public static int PlayerAttacking (int PI, int EH, int K, int P, int T){

            if (PI == 1) {
                EH = EH - K;
            }
            else if (PI == 2) {
                EH = EH - P;

            }
            else if (PI == 3) {
                EH = EH - T;


            } else {
                System.out.println("Nothing happens, you didn't do it right");
            }
            return(EH);
        }
*/

//enemy attacking, should return player health.
    /* public static int EnemyAttacking (int EI, int PH, int K, int P, int T){


        if (EI == 1) {
            PH = PH - K;
        }
        else if (EI == 2) {
            PH = PH - P;

        }
        else if (EI == 3) {
            PH = PH - T;


        } //else {
          //  System.out.println("Nothing happens, you didn't do it right");
        //}
        return(PH);
    }*/

}