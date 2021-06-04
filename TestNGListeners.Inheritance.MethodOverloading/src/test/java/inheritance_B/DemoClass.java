package inheritance_B;

class DemoClass {

	public static void main(String[] args) {
		
		DemoClassC dC = new DemoClassC();
		dC.demoB();
	}
}

class DemoClassA {
	
	@SuppressWarnings("unused")
	private void demoA() {
		System.out.println("This is private demoA.");
	}
	
}

class DemoClassB extends DemoClassA {

	public final void demoB() {
		System.out.println("This is final demoB.");
	}
	
	// Private method is not visible to child class as a result over riding concepts is not applicable. 
	// And it cannot be inherited..
	@SuppressWarnings("unused")
	private void demoA() {
		System.out.println("This is extended private demoA.");
	}

}

class DemoClassC extends DemoClassB {

	public void demoC() {
		System.out.println("This is demoC.");
	}
	
	// If parent called a method final, child can inherit that method but cannot over ride. 
	// Child even cannot have same method signature.
	
	/*public final void demo2() {
		System.out.println("This is extended final demo2.");
	}*/

}
