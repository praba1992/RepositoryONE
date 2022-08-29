package javalearn;

public class LocalGlobalThisVariables {

	int x;

	public static void main(String[] args) {

		LocalGlobalThisVariables lgv = new LocalGlobalThisVariables();
		lgv.add(10, 10);
		lgv.multiple();

	}

	private void add(int a, int b) {
		int x = 111;

		System.out.println("Local variable value: " + x);
		System.out.println("Instance variable Default value: " + this.x);
		System.out.println();
		System.out.println("By using this keyword:");
		System.out.println(a + b + this.x);
		System.out.println();
		System.out.println("By using local variable");
		System.out.println(a + b + x);
		System.out.println();
		System.out.println("Call method using this keyword");
		System.out.println(a+b+this.multiple());
	}

	private String multiple() {

		return "praba";
	}

}
