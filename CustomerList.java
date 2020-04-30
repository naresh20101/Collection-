import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;
public class CustomerList {
	static ArrayList<Customers> customer =new ArrayList<>();
	static ArrayList<Receipt> receipt =new ArrayList<>();
	Customers s=new Customers();
	int tPrice;
	Scanner sc=new Scanner(System.in);
	String ch;
	boolean f=true;
	public void addCustomer()
	{
		 ProductList p=new ProductList();
		
		System.out.println("..............ADD CUSTOMER.............");
		System.out.println("Enter Customer ID:");
		String id=sc.next();
		s.setId(id);
		System.out.println("Enter Customer Name:");
		String name=sc.next();
		s.setName(name);
		System.out.println("Enter Customer Phone No:");
		String phoneNo=sc.next();
		s.setPhoneNo(phoneNo);
		System.out.println("Enter Customer Address:");
		String address=sc.next();
		s.setAddress(address);
		
		customer.add(s);
		
	do
	{
		Receipt r=new Receipt();
		System.out.println("What Product u want to buy:");
		String Pname=sc.next();
		
		for(Products p1:p.product)
		{
			p1.add
			if(p1.getName().equals(Pname))
			{
				f=false;
				System.out.println("Enter Product Quantity:");
				int  quantity=sc.nextInt();
				if(p1.getQuantity()>=quantity)
				{
					int q=p1.getQuantity();
					q-=quantity;
					p1.setQuantity(q);
					tPrice+=quantity*p1.getPrice();
					r.setName(Pname);
					r.setPrice(p1.getPrice());
					r.setQuantity(quantity);
					receipt.add(r);
					break;
					
				}
				else
				{
					System.out.println(p1.getName()+ " is out of Stock");
					break;
				}
			}
			else
			{
				f=true;
			}
			
			
			
			}
			
			
		
		if(f==true)
		{
			System.out.println("Product Does not Exist");
		}
		
		System.out.println("Do You want to buy Another Products:");
		ch=sc.next();
	}
	
	while(ch.equals("y"));
	
	showReceipt();
	

	}
	public void showReceipt()
	{
		System.out.println("Get Your Receipt");
	     System.out.println("---------------------------------------------------------------");
		Random random=new Random();
	     int orderNo=random.nextInt(10000);
	     LocalDate date=LocalDate.now();
	     int i=1;
	     System.out.println("Customer name: "+s.getName()+"  Date: "+date+"  Order no:  "+orderNo);
	     for(Receipt r:receipt)
	     {
	         
	         System.out.print(i+" ");
	         System.out.println(r);
	         i++;
	         
	     }
	     System.out.println();
	     System.out.println("Total price = "+tPrice);
	     System.out.println();
	     System.out.println("           Thank You               ");
	     System.out.println("------------------------------------------------------------");
	     
	    menu();
	}
	public void menu()
	{
		System.out.println("1.Add Customer:");
		System.out.println("2 Get Products:");
		System.out.println("2.Exit");
		System.out.println("Enter  Choise:");
		int choise=sc.nextInt();
		ProductList p=new ProductList();
		if(choise==1)
		{
			addCustomer();
		}
		else if(choise==2)
		{
			p.display();
		}
		
		
	}
	
}
