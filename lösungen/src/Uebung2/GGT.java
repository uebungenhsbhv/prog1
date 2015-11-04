public class GGT {
	public static void euklid(int a, int b) {
		if(b == 0) {
			System.out.println(a);
			return;
		} else {
			euklid(b, a%b);
		}
	}
	
	public static void main(String[] args) {
		int a = 12402,
			b = 1204;
		euklid(a,b);
	}
}