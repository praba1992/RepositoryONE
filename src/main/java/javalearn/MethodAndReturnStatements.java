package javalearn;

public class MethodAndReturnStatements {

	private void methodpublic(int a, int b) {
		int c = a - b;
		System.out.println("Ans: " + c);
	}

	private void privateMethod() {
		System.out.println("private method");
	}

	public Boolean stringmethod() {
		return true;

	}

	private void numbers(String num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		MethodAndReturnStatements mts = new MethodAndReturnStatements();
		mts.numbers("1");
		mts.numbers("12");
		mts.numbers("123");
		mts.numbers("1234");
		mts.numbers("12345");
		System.out.println();
		Boolean stringmethod = mts.stringmethod();
		System.out.println(stringmethod);
		mts.methodpublic(50, 1000);
		mts.privateMethod();
	}

}
