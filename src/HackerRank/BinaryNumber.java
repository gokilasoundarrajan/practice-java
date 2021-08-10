package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// print count of max consecutive 1's in Binary
// 125 = 1111101 => print 5

public class BinaryNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		bufferedReader.close();

		int max = 0, count = 0;
		while (n >= 1) {
			if (n == 1 || n % 2 == 1) {
				count++;
				if (max < count)
					max = count;
			} else {
				count = 0;
			}
			n /= 2;
		}
		System.out.println(max);
	}
}
