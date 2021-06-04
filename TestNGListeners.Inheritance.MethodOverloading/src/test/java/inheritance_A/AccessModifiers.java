package inheritance_A;

public class AccessModifiers {

	public static void main(String[] args) {
		
		Mammal mammal1 = new Mammal();
		mammal1.publicMammal();
		mammal1.protectedMammal();
		mammal1.defaultMammal();
		System.out.println();
		Whale whale = new Whale();
		whale.publicMammal();
		whale.defaultMammal();
		whale.protectedMammal();
		System.out.println();
		Mammal mammal2 = new Whale();
		mammal2.publicMammal();
		mammal2.defaultMammal();
		mammal2.protectedMammal(); // Child method can not override Protected parent method.
	}

}

class Mammal {

	public void publicMammal() {
		System.out.println("This is the Public mammal.");
	}

	protected void protectedMammal() {
		System.out.println("This is the Protected mammal.");
	}
	void defaultMammal() {
		System.out.println("This is the Default mammal.");
	}
	
	// Private method can only be accessed from within its own class.
	@SuppressWarnings("unused")
	private void privateMammal() {
		System.out.println("This is the Private mammal.");
	}


}

class Whale extends Mammal {

	public void publicMammal() {
		System.out.println("This is the Child whale overriding the Public mammal.");
	}

	void defaultMammal() {
		System.out.println("This is the Chile whale overriding the Default mammal.");
	}
	
	//------Child method can not override Protected parent method------
	protected void protectedMammal() {
		System.out.println("This is the Child whale overriding the Protected mammal.");
	}
	
}

