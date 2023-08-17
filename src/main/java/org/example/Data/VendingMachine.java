package org.example.Data;

import org.example.Model.Money;
import org.example.Model.Product;

import java.util.Objects;

public class VendingMachine extends Product implements IVendingMachine {

    private int depositPool;
    private Money amt;
    Product[] products;


    public VendingMachine(Product[] products) {
        this.products = products;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String examine() {
        return null;
    }

    @Override
    public String use() {
        return null;
    }


    @Override
    public void addCurrency(Money amt) {
        for (Money m : Money.values()) {
            if (m == amt) {
                depositPool += amt.getValue();
                ;
            }
        }
    }

    @Override
    public int getBalance() {
        return depositPool;
    }
    @Override
    public Product request(int id) {

        for (Product product : products) {
            if (Objects.equals(product.getId(), id) && depositPool >= product.getPrice()) {
                depositPool -= product.getPrice();
                System.out.println("You successfully bought the " + product.getProductName());
                System.out.println("Money left in depositPool "+depositPool);
            }
        }
        System.out.println("return stmt");
        return products[id];
    }


    @Override
    public int endSession() {
        int temp = depositPool;
        depositPool = 0;
        return temp;
    }

    @Override
    public String getDescription(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product.examine();
            }
        }
        return null;
    }

    @Override
    public String[] getProducts() {
        //Responsible to return items
        String[] stringProduct = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            stringProduct[i] = products[i].examine();
        }

        return stringProduct;
    }

}
