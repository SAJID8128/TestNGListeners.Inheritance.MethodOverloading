package overloadingMethod;

public class DataTypes {

	public static void main(String[] args) {
		System.out.println(Add(808, 812));
		System.out.println(Add(2.08, 2.12));
		System.out.println(Add("Hello", "World!"));
	}
	
	public static int Add(int a, int b) {
		return a+b;
	}
	
	public static double Add(double a, double b) {
		return a+b;
	}
	
	public static String Add(String a, String b) {
		return a+b;
	}

}
