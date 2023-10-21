package globallocal;

public class userdefined {
	static int a=13;
	static int b=67;
	

	public static void main(String[] args) {
//		int a=10;
//		int b=23;
		int c=a+b;
		System.out.println(c);
		add();

	}
	public static void add() {
		System.out.println(a*b);
	}

}
