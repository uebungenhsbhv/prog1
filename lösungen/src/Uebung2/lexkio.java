package Uebung2;

public class lexkio{
	
	public static void main(String[] args) {
		int n = 0;
		String my1 = "autobus";
		String my2 = "auto";
		char[] arr1 = my1.toCharArray();
		char[] arr2 = my2.toCharArray();
		
		if(arr1.length >= arr2.length) {
			n = arr2.length;
		} else {
			n = arr1.length;
		}
		
		for(int i = 0; i < n; i++) {
			if(arr1[i] != arr2[i]) {
				if(arr1[i] < arr2[i]) {
					System.out.println(my1 + " kommt vor " + my2);
					return;
				} else {
					System.out.println(my2 + " kommt vor " + my1);
					return;
				}
			} else if(i + 1 == n) {
				if(arr1.length >= arr2.length) {
					System.out.println(my2 + " kommt vor " + my1);
					return;
				} else {
					System.out.println(my1 + " kommt vor " + my2);
					return;
				}
			}
		}
		
	}
	
}