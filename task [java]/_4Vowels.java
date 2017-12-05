public class _4Vowels {
	public static void main(String[] args) {
	//	String words = args[0];
		String words = "Drink Water";
		System.out.println("Input: " + words);
		words = words.toLowerCase();
		String[] vowels = {"a","i","u","e","o"};
		int y = vowels.length;
		int a = 0, b = 1, count = 0;
		for (int x = 0;x < words.length();x++) {
			String letter = words.substring(a,b);
			for (int c = 0;c < y;c++) {
				if (letter.matches(vowels[c])) {
					count++;
				}
			}
			a++;b++;
		}
		System.out.println("Number of Vowels in the string: " + count);
	}
}