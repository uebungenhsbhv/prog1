public class Life {
	public static void main(String[] args) {
		int spalten = 23,
			zeilen = 13,
			i = 0,
			j = 0,
			m = 2;

		boolean[][] arr = new boolean[zeilen][spalten];
		
		for(i = 0; i < arr.length; ++i) {
			for(j = 0; j < arr[i].length; ++j) {
				if(j % m == 0) {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
				
				if(arr[i][j]) {
					System.out.print('X');
				} else {
					System.out.print('_');
				}
			}
			m++;
			System.out.println();
		}
	}
}
