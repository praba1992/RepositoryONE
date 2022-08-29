package javalearn;

public class StaticMethod {

	int a = 10;
	static int d = 100;

	static public void display() {
		System.out.println(d);
		System.out.println("Static method");
	
	
		String s = "100";
		String f = "100";
		
		int ss = Integer.parseInt(s);
		int ff = Integer.parseInt(f);
		System.out.println(ss + ff);
	}
	
	
	private void method() {
		String s = "100";
		String f = "100";
		
		int ss = Integer.parseInt(s);
		int ff = Integer.parseInt(f);
		System.out.println(ss + ff);
	}

	public static void main(String[] args) {
		 StaticMethod sm=new StaticMethod();
		StaticMethod.display();
		sm.method();
		

	}
}
