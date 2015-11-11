public class Life6 {
	
	public static void main(String[] args) {
		int zeilen = 5;
		int spalten = 10;
		boolean[][] a = new boolean[zeilen][spalten];
		boolean[][] b = new boolean[zeilen][spalten];
		
		init(a);

		while(true) {
			neuberechnen(a, b);
			ausgabe(a, b);
			System.out.println();
		}
	}
	
	public static void init(boolean[][] a) {
		int m = 2;
		for(int i = 0; i < a.length; ++i) {
			System.out.println();
			for(int j = 0; j < a[i].length; ++j) {
				if(j % m == 0) {
					a[i][j] = true;
				} else {
					a[i][j] = false;
				}
			}
			++m;
		}
	}
	
	public static void ausgabe(boolean[][] a, boolean[][] b) {
		for(int i = 0; i < b.length; ++i) {
			System.out.println();
			for(int j = 0; j < b[i].length; ++j) {
				if(b[i][j]) {
					System.out.print('X');
				} else {
					System.out.print('_');
				}
			}
		}
	}
	
	public static void neuberechnen(boolean[][] a, boolean[][] b) {
		int anzahl = 0;
		for(int i = 0; i < a.length; ++i) {
			for(int j = 0; j < a[i].length; ++j) {
				if(a[(i-1 + a.length) % a.length][(j-1 + a[i].length) % a[i].length]) {
					++anzahl;
				}
				if(a[(i-1 + a.length) % a.length][j]) {
					++anzahl;
				}
				if(a[(i-1 + a.length) % a.length][(j+1 + a[i].length) % a[i].length]) {
					++anzahl;
				}
				if(a[i][(j-1 + a[i].length) % a[i].length]) {
					++anzahl;
				}
				if(a[i][(j+1 + a[i].length) % a[i].length]) {
					++anzahl;
				}
				if(a[(i+1 + a.length) % a.length][(j-1 + a[i].length) % a[i].length]) {
					++anzahl;
				}
				if(a[(i+1 + a.length) % a.length][j]) {
					++anzahl;
				}
				if(a[(i+1 + a.length) % a.length][(j+1 + a[i].length) % a[i].length]) {
					++anzahl;
				}
				
				if(a[i][j] && (anzahl == 2 || anzahl == 3)) {
					b[i][j] = true;
				} else if(!a[i][j] && anzahl == 3) {
					b[i][j] = true;
				} else if(anzahl > 3 || anzahl < 2) {
					b[i][j] = false;
				}
				anzahl = 0;
			}
		}

		for(int k = 0; k < a.length; ++k) {
			for(int l = 0; l < a[k].length; ++l) {
				a[k][l] = b[k][l];
			}
		}
	}

}
