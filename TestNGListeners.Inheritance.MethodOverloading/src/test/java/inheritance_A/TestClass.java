package inheritance_A;

public class TestClass {

public static void main(String[]args) {
	
		System.out.println("Output for Single Level Inheritance");
		SingleLevel_Parent sP = new SingleLevel_Parent();
		sP.grandparentA();
		sP.grandparentB();
		System.out.println();
		System.out.println("Output for Multilevel Inheritance");
		Multilevel_ChildA mC = new Multilevel_ChildA();
		mC.grandparentA();
		mC.grandparentB();
		System.out.println();
		System.out.println("Output for Hierarchical Inheritance");
		HierarchicalBradyA hA = new HierarchicalBradyA();
		hA.bunch();
		HierarchicalBradyB hB = new HierarchicalBradyB();
		hB.bunch();
		HierarchicalBradyC hC = new HierarchicalBradyC();
		hC.bunch();
	}

}
// Note: Java does not support multiple inheritance in the case of class because
// a class can extend only one class BUT Java does support multiple inheritance in the 
// case of interface where one interface can extend multiple interfaces.

// Note: Java does not support hybrid inheritance which involves both single level and 
// multiple inheritance.