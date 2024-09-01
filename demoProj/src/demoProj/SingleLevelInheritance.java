package demoProj;

class A{
	public void show() {
		System.out.println("hello");
	}
}
class B extends A{
	public void show() {
		System.out.println("Override");
	}
}

public class SingleLevelInheritance {
	public static void main(String[] args) {
		
		
		B obj= new B();
//		B newobj= new A();
		A newobj= new B();
//		
		obj.show();
		
	}
}
