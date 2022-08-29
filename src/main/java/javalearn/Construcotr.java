package javalearn;

public class Construcotr {
	int x;
	String name;
	byte age;
	short id;
	float point;
	double percentage;
	Boolean value;
	char initial;
	

	public Construcotr(int x) {
		this.x = x;
		System.out.println(x);
	}
	
	
	
	public Construcotr(int x,String s) {
		this.name=s;
		this.x=x;
		System.out.println(s);
	}
	
	
	

	private void method() {
		System.out.println(x + "......." + name);
	
	}

	public static void main(String[] args) {
		Construcotr con=new Construcotr(100);
		con.method();
		Construcotr con2=new Construcotr(300, "praba");
		con2.method();
	}
}
