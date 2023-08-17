package org.example;

import org.example.Model.IVendingMachine;

public class VendingMachine extends Product implements IVendingMachine {

    private int depositPool;
    private Money amt;
    Product[] products;


    public VendingMachine( Product[] products)
    {
        this .products = products;
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
        for (Money m:Money.values()) {
            if (m == amt) {
                depositPool+= amt.getValue(); ;
            }
        }
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        for (Product product:products) {
            if(getId()==id)
            {
                if(product.getPrice()<=depositPool)
                {
                    depositPool=(int) (depositPool-product.getPrice());
                    return product;
                }
                else throw new RuntimeException("Product"+product.getProductName()+"Is expensive");
            }
        }
         throw new RuntimeException("COULD NOT FIND PRODUCT");
    }

    @Override
    public int endSession() {
        int temp=depositPool;
        depositPool=0;
        return temp;
    }

    @Override
    public String getDescription(int id) {
        for (Product product:products)
        {
            if(product.getId()==id)
            {
                return product.examine();
            }
        }
        return null;
    }

    @Override
    public String[] getProducts() {
        //Responsible to return items
        String[] stringProduct=new String[products.length];
        for(int i=0;i<products.length;i++)
        {
            stringProduct[i]=products[i].examine();
        }

        return stringProduct;
    }

}
