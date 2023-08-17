package org.example.Model;

public class Marbou extends Product {
    private String nuts;
    boolean hasNuts;

    public String checkNuts(String nuts) {
        if (isHasNuts()) {
            nuts = "Cashew,Pista and HazelNuts";

        } else {
            nuts = "No nuts ";
        }
        return nuts;
    }

    public String getNuts() {
        return nuts;
    }

    public void setNuts(String nuts) {
        this.nuts = nuts;
    }

    public boolean isHasNuts() {
        return hasNuts;
    }

    public void setHasNuts(boolean hasNuts) {
        this.hasNuts = hasNuts;
    }

    public Marbou(int id, double price, String productName, boolean isnuts) {
        setId(id);
        setPrice(price);
        setProductName(productName);
        setHasNuts(isnuts);
    }

    public String examine() {
        return ("ID :" + getId() + "  Price is : sek " + getPrice() + "   ProductName : " + getProductName() + "  Nuts  :" + checkNuts(nuts));
    }

    public String use() {
        return "Is nuts  :" + getNuts() + isHasNuts() + ".  Thank you..! --Enjoy your chocolate--";
    }

}
