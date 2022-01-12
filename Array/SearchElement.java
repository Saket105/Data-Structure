package bruteForce;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {20,5,7,25};
		System.out.println(search(a,5));
	}
	
	public static int search(int a[], int num) {
		int n = a.length;
		for(int i=0;i<n;i++) {
			if(num == a[i]) {
				return i;
			}
		}
		return -1;
	}
}
