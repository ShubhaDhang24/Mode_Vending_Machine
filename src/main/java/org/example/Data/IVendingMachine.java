package org.example.Data;

import org.example.Model.Money;
import org.example.Model.Product;

public interface IVendingMachine {


     void addCurrency(Money amt);
     int getBalance();
     Product request(int id); //By default they are public abstract so we can write without them
    int endSession();
     String getDescription(int id);
     String[] getProducts();
}
