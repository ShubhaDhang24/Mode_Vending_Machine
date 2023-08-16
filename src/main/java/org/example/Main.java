package org.example;

public class Main {
    public static void main(String[] args) {

        Milk_choco milk_choco = new Milk_choco(1, 10, "Milk_Chocolate", "30% choco & 70% milk");
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
        System.out.println(marbouWithoutNuts.examine());

    }
}