package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringToInteger {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String S = bufferedReader.readLine();
		bufferedReader.close();

		try {
			int num = Integer.valueOf(S);
			System.out.println(num);
		} catch (Exception ex) {
			System.out.print("Bad String");
		}

	}
}
