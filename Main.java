

import java.util.Date;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Date date = new Date();
		
		Mutable obj = new Mutable("Date : 24th May,2021 23:51:56 \n "
				+" Salad RS: 3.5 \n Raspberry RS: 3.5 \n"
				+ " Chocolate Pudding RS: 4.5 \n"
				
				);
		Immutable obj1 = new Immutable  (" Salad RS: 3.5 \t\t\t Japanese Noodles RS: 4.5 \t Spaghetti RS: 3.7 \n"
		  		+ " Spaghetti Meat Balls RS: 4.5 \t Noodles RS: 5.5 \t\t Kids Spaghetti RS: 4.0 \n Chicken Rice RS: 3.5 \t\t"
		  		+ " Thai Food RS: 6.5 \t\t Vietnam Food RS: 6.5\n" ,
		  		" Raspberry RS: 3.5 \t\t Chocolate Pudding RS: 4.5 \t Blue Hwailan RS: 3.0 \n "
		  		+ " Pina RS: 5.0 \t\t\t Lemon ice RS: 3.0 \n",
		  		" Strawberry Cake Price: R 2.5 \t Choclate Cake Price: RS: 3.0 \n  ");
		System.out.println ("Welcome to the Food Ordering System ");
    	
    	System.out.println ("************************");
    	
    	System.out.println ("*******Main Menu*********");
    	
    	System.out.println ("************************");
    	System.out.println ("1. I want to order");
    	System.out.println ("2. Foods ");
    	System.out.println ("3. Drinks");
    	System.out.println ("4. Desserts");
    	System.out.println ("5. Report");
    	System.out.println ("6. Exit");
    	System.out.println ("************************"+"\n");
    	
    	System.out.println ("*******ORDER********\n");
    	System.out.println ("What you want to Order ?");
    	String st=sc.nextLine();
    	
    	
    	

    	
    	// Since no setters are available contents cannot be modified.
        // Also as variables are declared final they cannot be modified
       		System.out.println ("******FOODS NAME**************");
        	System.out.println("Foods are :  \n" + obj1.getFoodName()+"\n");
        	
        	System.out.println ("*********DRINKS NAME***********");
        	System.out.println("Drinks are :  \n" + obj1.getdrinkName()+"\n");
		
        	System.out.println ("*********DESSERTS***********");
        	System.out.println("Desserts are :  \n" + obj1.getdesserts()+"\n");
        	
System.out.println ("************************\n");
        	
        	System.out.println ("*******ORDER FORM*******\n");
        	
        	System.out.println ("************************\n");
        	 System.out.print("Name: \n");  
 	     	String str= sc.nextLine();              //reads string  
 	       
 	     	
 	     	System.out.print("Telephone number: \n");  
 	     	Long a= sc.nextLong(); 
 	     	
 	     	
        	
        	System.out.println ("************************\n");
        	
        	System.out.println ("*******PAYMENT*******\n");
        	
        	System.out.println ("************************\n");
        	 System.out.print("Enter a card holder name: \n");  
 	     	String string= sc.nextLine();              //reads string  
 	     	System.out.print("Card Holder Name is: "+string+"\n");   
 	     	
 	     	System.out.print("Enter a card number: \n");  
 	     	int b= sc.nextInt();              //reads string  
 	     	System.out.print("Your Card Number is: "+b+"\n");
 	     	
 	     	 
 	     		 System.out.print("Expiration Date: ");
 		            System.out.println(new Date( )); 
 		            	      		             	 
 	     	System.out.println("Enter Security Code: ");  
 	     	int c= sc.nextInt();              //reads string  
 	     	System.out.print("Your Security Code is: "+c+"\n");
 	     	
 	   	System.out.println ("************************\n");
 	   	
 		System.out.println ("********REPORT*********\n");
 		
 		System.out.println ("************************\n");
 	     	
 	     	System.out.println("Previous Report!");
 	     	System.out.println ("************************");
        	System.out.println("" +obj.getReport()+"\n");
        	
        	
        	// update the name, this object is mutable
    		System.out.println("Updating current Report!");
    		System.out.println ("************************");
    		 try { 
 	     		 System.out.print("Date: ");
 		            System.out.println(new Date( )); 
 		            Thread.sleep(5*60*10); 
 		           
 		         } catch (Exception e) {
 		            System.out.println("Got an exception!"); 
 		         }
    		obj.setReport(" Japanese Noodles RS. 4.5 * 1 \n Blue Heailan RS 3.0 * 2 \n "
    				+ "Chocolate Cake RS. 3.0 * 1");
    		System.out.println("" +obj.getReport()+"\n");
    		
    		System.out.println ("*****************\n");
    		System.out.println ("How many orders you have done in previous and current Report?\n");
    		Order obj2 = new Order();//only one object  
    		
    		demo1 t1=new demo1(obj2);
    		
    		demo2 t2=new demo2(obj2);
    		t1.start();
    		t2.start();
	
    		
    		
         }
    		
	}


