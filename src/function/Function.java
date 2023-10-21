package function;
public class Function {
	public static void main(String[] args) {
		System.out.println("Start : ");
		Addition(12,45);
		hello();
		Addition(34,23);
		System.out.println("End :");
	}
	public static void Addition(int a,int b){
		                        //argument
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}
	public static void hello() {
		System.out.println("Hello");
	}

}
