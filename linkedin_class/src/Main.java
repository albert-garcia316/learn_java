import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("play roll the dice. To start type: roll the dice");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        if(input.equals("roll_the_dice")){
            System.out.println("in the if");
            Dice d = new Dice();
            d.roll();
        }


//        int age = in.nextInt();
//
//        if(age >= 0 && age <= 5){
//            System.out.println("baby");
//        }
//        else if(age > 5 && age <= 12){
//            System.out.println("child");
//
//        }
//        else if(age > 12 && age <= 17){
//            System.out.println("teenager");
//
//        }
//        else if(age > 17){
//            System.out.println("adult");
//
//        }
//        else {
//            System.out.println("invalid entry");
//        }

//        System.out.println("Albert");
//        Car myCar = new Car(25.5,
//                "iBC32E",
//                Color.BLUE,
//                true);
//
//        Car sallyCar = new Car(13.9,
//                "3D2OBN",
//                Color.BLACK,
//                false);
//        System.out.println("My car's license plate: " + myCar.licensePlate);
//        System.out.println("Sally's car license plate: " + sallyCar.licensePlate);
//        System.out.println("My car's color: " + myCar.paintColor);
//        myCar.changePaintColor(Color.red);
//        System.out.println("My car's new color: " + myCar.paintColor);
//
//        Dog myDog = new Dog("Scooby", "Female", "Lab");
//        System.out.println("my dog's name is: " + myDog.name);
//        myDog.bark();
//        String action = myDog.wagTail();
//        System.out.println(action);
//        myDog.info();

    }


}
