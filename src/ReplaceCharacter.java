
public class ReplaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Geeks for Geeks";
		char ch = 'H';
		int index = 6;
		System.out.println("The original Strings are : " + s);
		
		//substring method
		//s = s.substring(0, index)+ ch + s.substring(index+1);
		
		StringBuilder str = new StringBuilder(s);
		str.setCharAt(index, ch);
		
		
		System.out.println("Modified Strings are : " + str);
		
		
		
		

	}

}
