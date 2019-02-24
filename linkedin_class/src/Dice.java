import java.util.Random;

public class Dice {
    int firstDie;
    int secondDie;
    Random rand;

    public  Dice(){
        this.rand = new Random();

    }
    public void roll(){
        this.firstDie = rand.nextInt(6) + 1;
        this.secondDie = rand.nextInt(6) + 1;
        System.out.println("the first die roll equals: " + this.firstDie);
        System.out.println("the second die roll equals: " + this.secondDie);
    }
}
