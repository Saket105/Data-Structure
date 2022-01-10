package mathmatics;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3, n = 2;
		
		System.out.println(power(x,n));
	}
	
	static int power(int n, int m) {
		int res=1;
		for(int i=0;i<m;i++) {
			res = res*n;
		}
		return res;
	}

}
