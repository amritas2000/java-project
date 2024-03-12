
public class ReverseWords1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Amrita", result = "";
		char ch;
		for(int i = 0; i<s.length(); i++) {
			ch = s.charAt(i);
			result = ch + result; //adds each character in front of the existing string
		}
		System.out.println("The modifies results are : " + result);
		

	}

}
