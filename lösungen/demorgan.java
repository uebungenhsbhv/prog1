package mypackage;

public class demorgan{
	public static void main(String[] args) {
		boolean a = true,
				b = true;
		
		for(int i = 0; i < 4; i++) {
			if(!(a && b) == !a || !b) {
				System.out.println("Erste Regel bewiesen!");
				System.out.println("Da: " + (!(a && b)) + " == " + (!a || !b));
			}
			
			if(!(a || b) == (!a && !b)) {
				System.out.println("Zweite Regel bewiesen!");
				System.out.println("Da: " + (!(a || b)) + " == " + (!a && !b));
			}
			if(a == true) {
				a = false;
			} else if(b == false) {
				b = true;
			} else {
				b = false;
			}
		}
	}
}