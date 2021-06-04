package overLoadingConstructor;

public class Marks {
	
	int result;

	public static void main(String[] args) {
		
		Marks m = new Marks(100);
		m.displayResult();
	}
	
	public Marks(int marks) {
		result = marks;
	}
	
	public void displayResult() {
		System.out.println("Final average for student is "+result);
	}

}
