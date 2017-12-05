public class _5CountWords {
	public static void main(String[] args) {
	//	String words = args[0];
		String words = "The quick brown fox jumps over the lazy dog.";
		System.out.println("Input: " + words);
		String[] word = words.split(" ");
		int size = word.length;
		System.out.println("Number of words in the string: "+size);
	}
}