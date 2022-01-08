package mathmatics;

public class NumberDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = -3;
		
		System.out.print("The count of number is : ");
		System.out.println(numbers(a));
	}
	
	public static int numbers(int num) {
		int count = 0;
		while(num != 0) {
			num = num/10;
			count++;
		}
		return count;
	}

}
