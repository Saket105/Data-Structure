package mathmatics;

public class SiereOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 23;
		
		primeNumber(n);
	}
	
	static void primeNumber(int n) {
		for(int i=2;i<=n;i++) {
			if(isPrime(i))
				System.out.print(i+" ");
		}
	}
	
	static boolean isPrime(int a) {
		if(a==1)
			return false;
		
		for(int i=2;i<a;i++) {
			if(a%i==0)
				return false;
		}
		return true;
	}

}
