package interfaceex;

public class MyClass implements MyInterface {

	@Override
	public void X() {
		System.out.println("x()");
	}

	@Override
	public void Y() {
		System.out.println("y()");
		
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
		
	}
	
	public static void main(String [] args) {
		MyClass myClass = new MyClass();
		X xClass = myClass;
		xClass.X();
	}
	
	
}
