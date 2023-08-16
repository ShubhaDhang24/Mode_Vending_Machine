package org.example;

public class Main {
    public static void main(String[] args) {

        Milk_choco milk_choco = new Milk_choco(1, 10, "Milk_Chocolate", "30% choco & 70% milk");
        System.out.println(" ");
        System.out.println(milk_choco.examine());
        System.out.println(milk_choco.use());

    }
}