
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HelloBeautiful";
		char ch[] = s.toCharArray();
		for(int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
			
		}

	}

}
