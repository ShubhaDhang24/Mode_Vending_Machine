package org.example;

import org.example.Data.VendingMachine;
import org.example.Model.Milk_Choco;
import org.example.Model.Money;
import org.example.Model.Polly;
import org.example.Model.Product;

public class Main {
    public static void main(String[] args) {



        Product[] products={
                new Milk_Choco(1,10,"MILK_CHOCOLATE","Contains 60% milk and 40% chocolate"),
                new Milk_Choco(2,50,"Milk_Choco_with_Nuts","60% MILK AND 40% NUTS"),
                new Polly(3,50,"Polly Drink","Zero sugar and zero soda",true),
                new Polly(4,100,"Polly soda","50% SODA AND 50% WATER",true),
                new Polly(5,20,"Polly candy","80% SUGAR AND 20% GELATIN",false),
        };
        VendingMachine vendingMachine=new VendingMachine(products);
        for (String s: vendingMachine.getProducts()
             ) {
            System.out.println(s);
        }

        vendingMachine.addCurrency(Money.HUNDRED);
        Product Milk_Choco= vendingMachine.request(1);
       System.out.println(Milk_Choco.use());
        System.out.println(vendingMachine.getBalance());
        Product Polly=vendingMachine.request(4);
        //System.out.println(Polly.examine());
        System.out.println(Polly.use());



    }
}