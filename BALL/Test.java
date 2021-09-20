package BALL;

public class BallTest extends Ball {

    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball("small");
        Ball b3 = new Ball("big", "basketball");
        Ball b4 = new Ball("normal", "volleyball", "white'n'yellow");

        b1.setSize("mini");
        b1.setType("football");
        b1.setColor("white'n'red");
        b2.setType("volleyball");
        b2.setColor("black");
        b3.setColor("white'n'green");

        System.out.println(b1);
        b1.choice();
        System.out.println(b2);
        b2.choice();
        System.out.println(b3);
        b3.choice();
        System.out.println(b4);
        b4.choice();
    }
}