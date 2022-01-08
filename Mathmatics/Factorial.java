package mathmatics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fact(n));
	}
	
	public static int fact(int num) {
		
		int res=1;
		for(int i=1;i<=num;i++) {
			res = res*i;
		}
		return res;
	}

}
