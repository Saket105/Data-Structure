package mathmatics;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12325;
		System.out.println(isPalin(a));
	}
	
	public static boolean isPalin(int n) {
		
		int rev = 0;
		int temp = n;
		while(temp != 0) {
			int ld = temp%10;
			rev = rev*10+ld;
			temp = temp/10;
		}
		
		return (rev == n);
	}

}
