package mathmatics;

public class AllDivisior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		printDivisior(n);
	}
	
	static void printDivisior(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				System.out.print(i+" ");
		}
	}

}
