package Uebung1;

public class zahlen {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,8,3,9,7};
		int min = 10,
			max = 0,
			sum = 0,
			ds = 0,
			n = 9;
		
		for(int i = 0; i < n; i++){
			sum = sum + a[i];
			if(min > a[i]){
				min = a[i];
			}
			
			if(max < a[i])
				max = a[i];
		}
		
		ds = sum/n;
		System.out.println("Minimum: " + min + " Maximum: " + max + " Summe: " + sum + " Duchschnitt: " + ds);
		
	}

}
