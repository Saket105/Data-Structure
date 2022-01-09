package mathmatics;


public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=4, b=6;
		System.out.println(lcm(a,b));

	}
	static int lcm(int a, int b) {
		int res = Math.max(a, b);
		while(true) {
			if(res%a==0 && res%b==0) {
				return res;
			}
			res++;
		}
//		return res;
		
		
	}

}
