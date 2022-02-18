

public class Client {
    public static void main(String[] args) {

        int SIX_SIDES = 6;
        int TWELVE_SIDES = 12;

        Die die1;
        die1 = new Die(SIX_SIDES);

        Die die2;
        die2 = new Die(TWELVE_SIDES);

        while (die1.getValue() != die2.getValue() && die2.getValue() != die1.getValue()*2){
            die1.roll();
            die2.roll();
            System.out.println("you rolled:" + die1.getValue() + "and" + die2.getValue());
            if (die1.getValue() == die2.getValue()*2 || die2.getValue() == die1.getValue()*2){
                System.out.println("game over, double value!");
            }



    }
}
