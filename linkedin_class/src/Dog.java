import  java.awt.*;

public class Dog {
    String name;
    String gender;
    String type;

    public Dog(
            String inputName,
            String inputgender,
            String inputType
    ){
        this.name = inputName;
        this.gender = inputgender;
        this.type = inputType;
    }
    public void bark(){
        System.out.println(this.name + " says bark! bark!");
    }
    public  String wagTail(){
        return this.name + " wags it's tail";
    }
    public void info(){
        System.out.println("My name is: " + this.name);
        System.out.println("I am a: " + this.gender + " " + this.type);
    }
}
