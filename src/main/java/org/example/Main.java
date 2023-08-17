package org.example;

import org.example.Model.Marbou;

public class Main {
    public static void main(String[] args) {

       /* Milk_choco milk_choco = new Milk_choco(1, 10, "Milk_Chocolate", "30% choco & 70% milk");
        System.out.println(" ");
        System.out.println(milk_choco.examine());
        System.out.println(milk_choco.use());

        System.out.println("--------------------------------------------");
        Polly polly=new Polly(2,2,"POLLY","20% KEX & 80% CHOCOLATE. ",false);
        System.out.println(polly.examine());
        System.out.println(polly.use());

        System.out.println("---------------------------------------------");
        Marbou marbou=new Marbou(3,30,"Marabou_choco",true);
        System.out.println(marbou.examine());

        Marbou marbouWithoutNuts=new Marbou(4,25,"Marbou",false);
        System.out.println(marbouWithoutNuts.examine());*/

        Product[] products={
                new Milk_choco(1,10,"MILK_CHOCOLATE","Contains 60% milk and 40% chocolate"),
                new Milk_choco(2,50,"Milk_Choco_with_Nuts","60% MILK AND 40% NUTS"),
        };
        VendingMachine vendingMachine=new VendingMachine(products);
        for (String s: vendingMachine.getProducts()
             ) {
            System.out.println(s);
        }

        vendingMachine.addCurrency(Money.HUNDRED);
        Product Milk_choco= vendingMachine.request(1);
        System.out.println(Milk_choco.use());
        System.out.println(vendingMachine.getBalance());



    }
}