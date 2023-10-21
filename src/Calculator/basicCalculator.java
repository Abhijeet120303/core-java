package Calculator;

public class basicCalculator {

	public static void main(String[] args) {
		
		System.out.println("**** WElcome ****");
		int a=addition(67,23);
		System.out.println(a);
		System.out.println(subtraactin(54,77));
		System.out.println(multiplication(3,9));
		System.out.println(division(66,11));
		
		System.out.println("Square");
		System.out.println(multiplication(7,7));
		
		System.out.println("Cube");
		int step1=multiplication(8,8);
		int step2=multiplication(step1,8);
		System.out.println(step2);
		//System.out.println(multiplication(8,multiplication(8,8)));

	}
	public static int addition(int a,int b) {
		return a+b;
	}
	public static int subtraactin(int a,int b) {
		return a-b;
	}
	public static int multiplication(int a,int b) {
		return a*b;
	}
	public static int division(int a,int b) {
		return a/b;
	}

}
