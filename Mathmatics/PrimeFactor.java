package mathmatics;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=12;
		primeFactor(n);

	}
	
	static void primeFactor(int a) {
		for(int i=2;i<a;i++) {
			if(isPrime(i)) {
				int x = i;
				while(a%x==0) {
					System.out.print(i+" ");
					x = x*i;
				}
			}
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
