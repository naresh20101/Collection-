import java.util.Scanner;
import java.util.ArrayList;
public class ProductList {
	
	 static CustomerList l=new CustomerList();
	static ArrayList<Products> product =new ArrayList<>();
public void add()
{
	
	Products p1=new Products();
	p1.setId("01");
	p1.setName("Laptop");
	p1.setQuantity(10);
	p1.setPrice(30000);
	p1.setDescription("Dell");
	product.add(p1);
	Products p2=new Products();
	p2.setId("02");
	p2.setName("VedioGamePlayer");
	p2.setPrice(2000);
	p2.setQuantity(10);
	p2.setDescription("Racing");
	product.add(p2);
	Products p3=new Products();
	p3.setId("03");
	p3.setName("MacBook");
	p3.setPrice(60000);
	p3.setQuantity(10);
	p3.setDescription("Apple");
	product.add(p3);
	Products p4=new Products();
	p4.setId("04");
	p4.setName("Tablet");
	p4.setPrice(40000);
	p4.setQuantity(10);
	p4.setDescription("Samsung");
	product.add(p4);
	l.menu();
	
}
public void display()
{
	for(Products e:product)
    {
        System.out.println(e);
    }
    System.out.println();
    System.out.println();
 

	l.menu();
	
    
}
	
}
