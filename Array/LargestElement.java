package bruteForce;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,8,20,10};
		
		System.out.println(largest(a));
		System.out.println(getLargest(a));
	}
	static int largest(int a[]) {
		int n = a.length;
		for(int i=0;i<n;i++) {
			boolean flag = true;
			for(int j=0;j<n;j++) {
				if(a[j]>a[i]) {
					flag = false;
					break;
				}
			}
			if(flag==true)
				return i;
		}
		return -1;
	}
	
//	Method 2
//	Efficient method
	static int getLargest(int a[]) {
		int n= a.length;
		int res=0;
		for(int i=0;i<n;i++) {
			if(a[i]>a[res])
				res =i;
		}
		return res;
	}

}
