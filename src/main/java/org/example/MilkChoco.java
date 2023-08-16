package org.example;
 class  Milk_choco extends Product{
    private String content;

     public String getContent() {
         return content;
     }
     public Milk_choco(int id,double price, String productName,String content)
     {
         setId(id);
         setPrice(price);
         setProductName(productName);
         setContent(content);
     }

     public void setContent(String content) {
         this.content = content;
     }

     public String examine()
     {
         return ("ID :"+getId()+"  Price is : sek "+getPrice()+"   ProductName : "+getProductName()+"  Content  :"+getContent());
     }
     public String use()
     {
         return "product Contains "+ getContent()+   ".  Thank you..! --Have a good day--";
     }

 }
