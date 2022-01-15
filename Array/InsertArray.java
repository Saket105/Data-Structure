package bruteForce;

public class InsertArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		a[0] = 5;
		a[1] = 10;
		a[2] = 20;
		int x=7;
		int pos = 2;
		System.out.println(insert(a, x, pos, a.length));

	}
	
	static int insert(int a[],int x, int pos, int cap) {
		int n = a.length;
		if(n==cap)
			return n;
		int idx = pos-1;
		for(int i=n-1;i>=idx;i--) {
			a[i+1] = a[i];
		}
		a[idx] = x;
		return (n+1);
	}

}
