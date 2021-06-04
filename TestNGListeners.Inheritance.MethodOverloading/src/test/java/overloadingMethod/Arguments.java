package overloadingMethod;

public class Arguments {

	public static void main(String[] args) {
		Arguments obj = new Arguments();
		obj.area(4.5f);
		obj.area(2.3f, 3.5f);
		obj.area(2.5f, 5.6f, 6.7f);

	}
	
	void area(float r) {
		float ar=3.1416f*r*r;
		System.out.println("Area of a Circle: "+ar);
	}
	
	void area(float l, float b) {
		System.out.println("Area of a Rectangle: "+(l*b));
	}
	
	void area(float pt, float b, float h) {
		System.out.println("Area of a Triangle: "+(pt*b*h));
	}

}
