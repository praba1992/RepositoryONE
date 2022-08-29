package javalearn;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.overload1("praba");
		mo.overload1(30);
		mo.overload1(122);
		mo.overload1('s');
		mo.overload1('s', 159, true);
		MethodOverloading mo2 = new MethodOverloading();
		mo2.overload1("karan");

	}

	private void overload1(String name) {
		System.out.println("name is: " + name);
	}

	private void overload1(int id) {
		System.out.println(id);
	}

	private void overload1(char name, long height, boolean status) {
		System.out.println("name is: " + name);
		System.out.println("height is " + height);
		System.out.println(status);
	}
}
