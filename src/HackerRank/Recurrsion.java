package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {
	public static int factorial(int n) {
		return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
	}
}

public class Recurrsion {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());
		bufferedReader.close();

		int result = Result.factorial(n);
		System.out.println(String.valueOf(result));
	}
}
