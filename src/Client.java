public class Client {
    public static void main(String[] args) {

        int SIX_SIDES = 6;
        int TWELVE_SIDES = 12;

        Die die1;
        die1 = new Die(SIX_SIDES);

        Die die2;
        die2 = new Die(TWELVE_SIDES);

        while (die1.getValue() != die2.getValue() && die2.getValue() != die1.getValue()*2){
            dice1.roll();
            dice2.roll();
            System.out.println("you rolled:", dice1.get_value(), "and", dice2.get_value());
            if (dice1.get_value() == dice2.get_value()*2 || dice2.get_value() == dice1.get_value()*2:){
                System.out.println("game over, double value!")
            }



    }
}
