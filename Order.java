
public class Order {
	synchronized void printOrders(int n){//synchronized method  
		for(int i=1;i<=3;i++){  
		System.out.println(n*i);  
		try{  
		Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		}  
		}  
}


 class demo1 extends Thread{  
	Order o;  
	demo1(Order o){  
	this.o=o;  
	}  
	public void run(){  
	o.printOrders(1);  
	}  
 

}

 class demo2 extends Thread{  
		Order o;  
		demo2(Order o){  
		this.o=o;  
		} 
		
		public void run(){  
		o.printOrders(1);  
		} 
		
}
