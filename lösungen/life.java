package mypackage;

public class life {
	public static void main(String[] args) {
		int spalten = 11,
			zeilen = 5,
			m = 2;
		
		for(int i = 0; i < zeilen; i++) {
			for(int j = 0; j < spalten; j++) {
				if(j % m == 0) {
					System.out.print("X");
				} else {
					System.out.print("_");
				}
			}
			m++;
			System.out.println();
		}
	}
}
