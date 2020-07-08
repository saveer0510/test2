package saveer;

public class Animal {  
	void eat(){System.out.println("eating...");}  
	}  
	class Dog extends Animal{  
	void bark(){System.out.println("barking...");}  
	}  
	class Cat extends Animal{  
	void meow(){System.out.println("meowing...");}  
	}  
	class TestInheritance3 extends Animal{  
	public static void main(String args[]){  
	Cat c=new Cat(); 
	Dog d=new Dog();
	c.meow();  
	c.eat(); 
	d.bark();
	//c.bark();//C.T.Error  
	}}  

