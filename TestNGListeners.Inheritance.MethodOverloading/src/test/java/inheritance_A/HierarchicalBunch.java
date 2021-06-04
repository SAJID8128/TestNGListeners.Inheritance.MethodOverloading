package inheritance_A;

//Hierarchical level inheritance
public class HierarchicalBunch {
	
	public void bunch () {

		System.out.println("Hi, this is the Brady Bunch!");
	}

}

class  HierarchicalBradyA extends HierarchicalBunch {
	public void bunch() {
		System.out.println("Hi, my name is Marsha!");
	}
}

class HierarchicalBradyB extends HierarchicalBunch {
	public void bunch() {
		System.out.println("Hi, my name is Jan!");
	}
}

class HierarchicalBradyC extends HierarchicalBunch {
	public void bunch() {
		System.out.println("Hi, my name is Cindy!");
	}
}
