package com.mvn.dependencyinjection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    /*product p=new product(1,"1+mobile",40000,1);
    order o=new order(1,"mobile",p);
     p.setProductId(1);
     p.setPname("oppo");
     p.setPrice(5000);
     p.setQuantity(1);
     /*System.out.println(p.getProductId());
     System.out.println(p.getPname());
     System.out.println(p.getPrice());
     System.out.println(p.getQuantity());*/
     
     //o.print();
    product p=new product();
    p.setProductId(1);
    p.setPname("oppo");
    p.setPrice(5000);
    p.setQuantity(1);
     order o=new order();
     o.setproduct(p);
     o.print();
     
     
     
    }
}
