package saveer;

public class NewArray {
	public  void test(){
	Car car[]=new Car[10];
	
	car[0]=new Car(123, "1231");
	car[1]=new Car(125, "1231");
	new Car(129999,"audi");
	  System.out.println("car 1:");
	    
	  car[0].setData(123,"hello");
	     car[0].showData();
	     System.out.println("car2");
	     car[1].showData();
	
	
	}
	public static void main(String args[]) {
	    new NewArray().test();		
			
			
		}
		
	
	
class Car{
	
	int price;
	String name;
	public Car(int i, String string) {
		this.price=i;
		this.name=string;
	}
	public void setData(int p,String n){
		 
		   price=p;
		   name=n;
		 }
		 public void showData(){
		   
		   System.out.println("price ="+price+" "+" name ="+name);
		 }
}}