package saveer;

public class Car {
	
	int price;
	String model,name ;
	public static void main(String[]args) {
		Car c1 = new Car();
		Car c2 = new Car();
		c1.model = "AMG";
		c1.name =  "benz";
		c1.price=100000;
		System.out.println(c1.name);
		System.out.println(c1.model);
		System.out.println(c1.price);
		c2.model = "A6";
		c2.name = "audi";
		c2.price=200000;
		System.out.println(c2.name);
		System.out.println(c2.model);
		System.out.println(c2.price);
		
		
	}

}
