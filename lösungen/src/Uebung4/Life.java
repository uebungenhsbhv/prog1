public class Life {
	public static void main(String[] args) {
		int spalten = 23,
			zeilen = 13,
			m = 2;
		boolean[][] arr = new boolean[zeilen][spalten];
		
		for(int i = 0; i < zeilen; i++) {
			for(int j = 0; j < spalten; j++) {
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
	}
}
