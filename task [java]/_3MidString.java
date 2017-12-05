public class _3MidString {
	public static void main(String[] args) {
	//	String words = args[0];
		String words = "350";
		System.out.println("Input: " + words);
		int a = words.length() / 2;
		int b = words.length() - a;
		if(words.length()%2==0) {
			System.out.println("The middle character in the string: "+words.substring(b-1,b+1));
		} else {
			System.out.println("The middle character in the string: "+words.substring(b-1,b));
		}
	}
}