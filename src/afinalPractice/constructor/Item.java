package afinalPractice.constructor;

public class Item {
    String name;
    double unitPrice;
    int quantity;

    public Item(String name,double unitPrice,int quantity){
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
public double calcCost(){
   return quantity*unitPrice;
}


    public String toString() {
        return "Name: " + name +" Unit price: " + unitPrice + " Quantity: "+ quantity + " Total price:  "+calcCost()+'\n';

    }
}
