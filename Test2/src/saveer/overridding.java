package saveer;


class A { 
	public void show()
	{
		System.out.print("in a");
	}
	
}
	
class B extends  A {
	@Override
	public void show()
	{
		
		System.out.print("in b");

		}
}
public class  overridding{
	public static void main (String [] args) {
		B oj1=new B();
		oj1.show();
	}
}


