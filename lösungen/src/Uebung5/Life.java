public class Life {
	public static void main(String[] args) {
		int spalten = 11,
			zeilen = 5,
			i = 0,
			j = 0,
			m = 2;

		boolean[][] arr = new boolean[zeilen][spalten];
		
		for(i = 0; i < arr.length; ++i) {
			for(j = 0; j < arr[i].length; ++j) {
				if(j % m == 0) {
					arr[i][j] = true;
					System.out.print('X');
				} else {
					arr[i][j] = false;
					System.out.print('_');
				}
			}
			m++;
			System.out.println();
		}
		
		boolean[][] b = new boolean[zeilen][spalten];
		int counter = 0;
		
		for(int k = 0; k < b.length; ++k) {
			for(int l = 0; l < b[k].length; ++l) {
				counter = count(arr, k, l);
				if(arr[k][l] && (counter == 2 || counter == 3)) {
					b[k][l] = true;
				} else if(!arr[k][l] && counter == 3) {
					b[k][l] = true;
				} else if(counter > 3 || counter < 2) {
					b[k][l] = false;
				}
			}
		}
		
		System.out.println();
		for(int o = 0; o < b.length; ++o) {
			for(int p = 0; p < b[o].length; ++p) {
				if(b[o][p]) {
					System.out.print('X');
				} else {
					System.out.print('_');
				}
			}
			System.out.println();
		}
	}
	
	public static int count(boolean[][] a, int b, int c) {
		int count = 0;
		
		if(b == 0 && c == 0) {
			if(a[b][c+1]) {
				++count;
			}
			if(a[b+1][c]) {
				++count;
			}
			if(a[b+1][c+1]) {
				++count;
			}
		} else if(b == 0 && c == a[b].length) {
			if(a[b][c-1]) {
				++count;
			}
			if(a[b+1][c-1]) {
				++count;
			}
			if(a[b+1][c]) {
				++count;
			}
		} else if(b == 0 && c+1 < a[b].length) {
			if(a[b][c-1]) {
				++count;
			}
			if(a[b][c+1]) {
				++count;
			}
			if(a[b+1][c-1]) {
				++count;
			}
			if(a[b+1][c]) {
				++count;
			}
			if(a[b+1][c+1]) {
				++count;
			}
		} else if(b == a.length && c == 0) {
			if(a[b-1][c]) {
				++count;
			}
			if(a[b-1][c+1]) {
				++count;
			}
			if(a[b][c+1]) {
				++count;
			}
		} else if(b+1 < a.length && c == 0) {
			if(a[b-1][c]) {
				++count;
			}
			if(a[b-1][c+1]) {
				++count;
			}
			if(a[b][c+1]) {
				++count;
			}
			if(a[b+1][c]) {
				++count;
			}
			if(a[b+1][c+1]) {
				++count;
			}
		} else if(b == a.length && c == a[b].length) {
			if(a[b-1][c-1]) {
				++count;
			}
			if(a[b-1][c]) {
				++count;
			}
			if(a[b][c-1]) {
				++count;
			}
		} else if(b+1 < a.length && c == a[b].length) {
			if(a[b-1][c-1]) {
				++count;
			}
			if(a[b-1][c]) {
				++count;
			}
			if(a[b][c-1]) {
				++count;
			}
			if(a[b+1][c-1]) {
				++count;
			}
			if(a[b+1][c]) {
				++count;
			}
		} else if(b == a.length && c+1 < a[b].length) {
			if(a[b-1][c-1]) {
				++count;
			}
			if(a[b-1][c]) {
				++count;
			}
			if(a[b-1][c+1]) {
				++count;
			}
			if(a[b][c-1]) {
				++count;
			}
			if(a[b][c+1]) {
				++count;
			}
		} else if(b-1 > 0 && b+1 < a.length && c-1 > 0 && c+1 < a[b].length){
			if(a[b-1][c-1]) {
				++count;
			}
			if(a[b-1][c]) {
				++count;
			}
			if(a[b-1][c+1]) {
				++count;
			}
			if(a[b][c-1]) {
				++count;
			}
			if(a[b][c]) {
				++count;
			}
			if(a[b][c+1]) {
				++count;
			}
			if(a[b+1][c-1]) {
				++count;
			}
			if(a[b+1][c]) {
				++count;
			}
			if(a[b+1][c+1]) {
				++count;
			}
		}

		return count;
	}
}
