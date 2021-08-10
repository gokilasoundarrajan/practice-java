package problems;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 102;
		int newNum = 0;
		while (num > 0) {
			newNum = (newNum * 10) + (num % 10);
			num /= 10;
		}
		System.out.println(newNum);
	}
}
