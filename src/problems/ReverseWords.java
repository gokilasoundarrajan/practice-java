package problems;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "My Name is Gokila";
		String[] strArr = str.split(" ");
		String newStr = "";
		for(int i=strArr.length-1; i>=0; i--) {
			newStr += strArr[i];
			newStr += " ";
		}
		System.out.println(newStr);
		
	}

}
