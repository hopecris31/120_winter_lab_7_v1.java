
import java.util.Scanner;
public class Client {


    public static void main(String[] args) {

        final int TWELVE_SIDES = 12; //how to define this constant in die without error

        Scanner getUserInput; //declaring

        Die die1;
        die1 = new Die();

        Die die2;
        die2 = new Die(TWELVE_SIDES);

        while (die1.getValue() != die2.getValue() && die2.getValue() != die1.getValue() * 2) {
            die1.roll();
            die2.roll();
            System.out.println("you rolled:" + die1.getValue() + "and" + die2.getValue());

            if (die1.getValue() == die2.getValue() * 2 || die2.getValue() == die1.getValue() * 2) {
                System.out.println("game over, double value!");
            } else {
                getUserInput = new Scanner(System.in); //gets user input
                getUserInput.nextLine(); //returns a string, tells you what UI is
                //need code here that restarts the loop after enter is pressed
            }


        }
    }
}
