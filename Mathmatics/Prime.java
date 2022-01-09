package mathmatics;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 121;
		boolean flag = isPrime(n);
		if(flag == false) {
		System.out.println("This is Not a prime number");
		}else {
			System.out.println("This is prime number");
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
