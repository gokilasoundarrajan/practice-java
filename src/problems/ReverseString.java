package problems;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		System.out.println(usingCharAt(str));
		System.out.println(usingCharArray(str));
		System.out.println(usingStringBuilder(str));
		System.out.println(usingStringBuffer(str));

	}
	
	static String usingCharAt(String str) {
		String newStr = "";
		for(int i=str.length()-1;i>=0;i--)
			newStr += str.charAt(i);
		return newStr;
	}
	
	static String usingCharArray(String str){
		char newCharArr[] = new char[str.length()];
		char[] charArr = str.toCharArray(); 
        for (int i = charArr.length - 1, j = 0; i >= 0; i--,j++)
        	newCharArr[j] = charArr[i];
        return String.valueOf(newCharArr);
	}
	
	
	static String usingStringBuilder(String str) {
		StringBuilder input = new StringBuilder();		 
        // append a string into StringBuilder input1
        input.append(str);
        // reverse StringBuilder input1
        input.reverse();
        return input.toString();
	}
	
	static String usingStringBuffer(String str) {
		StringBuffer strBuf = new StringBuffer(str);
		strBuf.reverse();
		return strBuf.toString();
	}
}
