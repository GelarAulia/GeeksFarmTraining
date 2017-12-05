public class _2Split {
	public static void main(String[] args) {
	//	String words = args[0];
		String words = "120831";
		System.out.println("Input: " + words);
		int x = 0;
		int y = 2;
		int wordsLength = words.length()/2;
		for (int a = 0;a < wordsLength;a++) {
			System.out.print(words.substring(x,y));
			System.out.print(" ");
			x += 2;
			y += 2;
		}
	}
}