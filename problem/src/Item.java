import java.util.ArrayList;
import java.util.List;

public class Item {
    List<String> input;
    int qty;
    String name;
    boolean imported;
    double price;
    double tax;
    double fullPrice;
    boolean exempt;


    public Item(
            List<String> input
    ){
        this.input = input;
        this.name = "";
        this.setDetails();
        this.isExempt();
        this.getTax();
    }
    public void setDetails(){
        this.qty = Integer.parseInt(this.input.get(0));
        this.price = Double.parseDouble(this.input.get(this.input.size() - 1));
        if(this.input.get(1).equals("exempt")){
            for(int i = 2; i < this.input.size() - 2; i++){
                if(i == this.input.size() - 3){
                    this.name = this.name + this.input.get(i);
                } else {
                    this.name = this.name + this.input.get(i) + " ";
                }
            }
        } else {
            for(int i = 1; i < this.input.size() - 2; i++){
                if(i == this.input.size() - 3){
                    this.name = this.name + this.input.get(i);
                } else {
                    this.name = this.name + this.input.get(i) + " ";
                }
            }
            if(this.name.contains("imported")){
                this.imported = true;
            }
        }
    }
    public void getTax(){
        if(this.exempt && this.imported){
//            tax rate of 5%
            this.tax = this.price * .05;
            this.round();
        }
        else if(!this.exempt && this.imported){
//            full tax of 15%
            this.tax = this.price * .15;
            this.round();
        }
        else if(!this.exempt){
//            tax rate of 10%
            this.tax = this.price * .10;
            this.round();
        } else { // no tax
            this.tax = 0.00;
            this.fullPrice = this.price;
        }
    }
    public void isExempt(){
        String[] keywords = {"book", "chocolate", "fruit", "food", "meal", "medicine", "pill", "bandage"};
        if(this.input.get(1).equals("exempt")) {
            this.exempt = true;
        } else {
            for(int i = 0; i < keywords.length; i++){
                if(this.name.contains(keywords[i])){
                    this.exempt = true;
                    break;
                }
            }
        }
    }
    public void round(){
        this.tax *= 100;
        this.tax = Math.round(this.tax);
        double temp = this.tax;
        this.tax = 0.00;
        while(temp > 100){
            temp -= 100;
            this.tax += 100;
        }
        while(temp  > 10){
            temp -= 10;
            this.tax += 10;
        }
        if(temp < 5){
            this.tax += 5;
        }
        else{
            this.tax += 10;
        }
        this.tax /= 100;
        this.fullPrice = this.tax + this.price;
        this.fullPrice *= 100;
        this.fullPrice = Math.round(this.fullPrice);
        this.fullPrice /= 100;
    }
}


