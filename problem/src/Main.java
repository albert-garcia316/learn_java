import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {


        try {
            ShoppingCart myCart = new ShoppingCart();
            System.out.println("Please use a .txt file");
            System.out.println("Please make sure you place the file in the same directory as Main.java. Thank you.");
            System.out.println("Enter the file name with extension => ");

//            final version:
            Scanner in = new Scanner(System.in);
            String f = "src/" + in.nextLine();
//            test version:
//            String f = "src/input.txt";
            File file = new File(f);

            Scanner input = new Scanner(file);


            while (input.hasNextLine()) {
                String line = input.nextLine();
                List<String> list = new ArrayList<>(List.of(line.split(" ")));

                if(list.size() > 2) { //make sure it is a line item
//                    System.out.println("made it to line item");
                    Item i = new Item(list);
//                    System.out.println(myCart.cartSize);
                    myCart.addItem(i);
//                    System.out.println(myCart.cartSize);
//                    System.out.println("added item " + i.name);
                }
                else if( list.size() == 2){
                    myCart.clearCart();
                }
                else {                        //line is at a blank space
                    myCart.printReceipt();
                }

                if(!input.hasNextLine()){
                    myCart.printReceipt();
                }

            }


            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Please make sure the file is in the same location as Main.js. Thank you.");
        }

    }
}
