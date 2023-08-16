package org.example;

public class Polly extends Product {
    private String contains;
    boolean isVegan;

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public String getContains() {
        return contains;
    }

    public void setContains(String contains) {
        this.contains = contains;
    }
    public Polly(int id, double price, String productName, String content,boolean isVegan) {
        setId(id);
        setPrice(price);
        setProductName(productName);
        setContains(content);
        setVegan(isVegan);
    }



    public String examine() {
        return ("ID :" + getId() + "  Price is : sek " + getPrice() + "   ProductName : " + getProductName() + "  Content  :" + getContains()+ "This is "+((isVegan)?"  vegan ":"  not vegan"));
    }

    public String use() {
        return "product Contains :" + getContains() + ".  Thank you..! --Enjoy your chocolate--";
    }
}
