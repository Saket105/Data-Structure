package mathmatics;

public class IterativePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =4, n =5;
		System.out.println(power(x,n));
	}
	
	static int power(int x, int n) {
		int res = 1;
		while(n>0) {
			if(n%2 != 0)
				res = res*x;
			x = x*x;
			n = n/2;
		}
		return res;
	}

}
