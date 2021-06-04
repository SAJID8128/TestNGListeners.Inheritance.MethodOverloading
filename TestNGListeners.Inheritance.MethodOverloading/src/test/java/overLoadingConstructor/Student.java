package overLoadingConstructor;

public class Student {
	
	int result;
	
	public static void main(String[] args) {
		Student obj = new Student(1);
		obj.displayResult();
	}
	
	public Student() {
		System.out.println("Hey, welcome to our University!");
	}
	
	public Student(String universityName) {
		System.out.println("Hey, welcome to "+ universityName +" University!");
	}
	
	public Student(int ranking) {
		System.out.println("Hey, welcome to our University which ranked #"+ ranking);
	}
	
	public Student(String universityName, int ranking) {
		System.out.println("Hey, welcome to University.");
	}
	
	public Student(int ranking, String universityName) {
		System.out.println("Hey, welcome to University.");
	}
	
	public void displayResult() {
		System.out.println("Final average for student is "+result);
	}

}
