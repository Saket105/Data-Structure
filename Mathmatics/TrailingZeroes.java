package mathmatics;

public class TrailingZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		System.out.println(trailingZeroes(n));
	}
	
	public static int trailingZeroes(int n) {

		int count = 0;
		for(int i=5;i<=n;i=i*5) {
			count = count+n/i;
		}
		return count;
		
	}

}
