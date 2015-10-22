package Uebung1;

public class schaltjahr{
	
	public static void main(String[] args) {
		int year = 1900;
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("Das Jahr " + year + " ist ein Schaltjahr!");
		} else {
			System.out.println("Das Jahr " + year + " ist KEIN Schaltjar!");
		}
	}
	
}