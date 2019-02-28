import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> cart = new ArrayList<>();
    double totalTax = 0.0;
    double cartTotal = 0.0;
    int cartSize = 0;

    public void addItem(Item i){
        this.cart.add(i);
        this.cartSize ++;
    }
    public void printReceipt(){
        System.out.println("New Ticket:");
        for(Item i : this.cart){
            this.totalTax += i.tax;
            this.cartTotal += i.fullPrice;
            System.out.println(i.name + ": " + String.format("%.2f", i.fullPrice));
        }
        this.totalTax *= 100;
        this.totalTax = Math.round(this.totalTax);
        this.totalTax /= 100;
        this.cartTotal *= 100;
        this.cartTotal  = Math.round(this.cartTotal);
        this.cartTotal /= 100;
        System.out.println("Sales Taxes: " + String.format("%.2f", this.totalTax));
        System.out.println("Total: " + this.cartTotal);
        System.out.println("End of this sale");
        System.out.println("----------------");
    }
    public void clearCart(){
        if(this.cartSize > 0){
            this.cart.clear();
            this.cartSize = 0;
            this.totalTax = 0.00;
            this.cartTotal = 0.00;

        }
    }
}
