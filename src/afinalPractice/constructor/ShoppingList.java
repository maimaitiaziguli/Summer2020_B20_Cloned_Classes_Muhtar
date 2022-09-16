package afinalPractice.constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {

    ArrayList<Item> list = new ArrayList<>();
    Item item1 = new Item("Iphone",699,4);
    Item item2 = new Item("Ipad",499,3);
    Item item3 = new Item("MacBook",1999,4);
    list.addAll(Arrays.asList(item1,item2,item3));
        System.out.println(list);

        System.out.println("==================================");

        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1,item2,item3));

        double totalPrice = 0;
        int totalQuantity = 0;
        for (Item each :shoppingList){

            totalPrice += each.calcCost();
            totalQuantity += each.quantity;

        }
        System.out.println("Total quantity: " + totalQuantity +'\n'+"Total price: " + totalPrice);


        System.out.println("===========================");

        System.out.println("Total payment: " + (item1.calcCost()+item2.calcCost()+item3.calcCost()));


}
}