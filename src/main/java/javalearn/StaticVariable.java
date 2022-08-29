package javalearn;

public class StaticVariable {

	
	int x;
	static int y;
	
	
	private void display() {
		System.out.println("x : "+x +"   "+"Y: "+y);
		x++;
		y++;
		
	}
	
	
	public static void main(String[] args) {

		
		StaticVariable sv=new StaticVariable();
		sv.display();
		sv.display();
		sv.display();
		sv.display();
		System.out.println();
		StaticVariable sv1=new StaticVariable();
		sv1.display();
		sv1.display();
		sv1.display();
		sv1.display();
		
	}

}
