public class _7BetweenTwoChar {
	public static void main(String[] args) {
		//char a = args[0].charAt(0);
		//char b = args[1].charAt(0);
		char a = '(';
		char b = 'z';
		System.out.println("1st Input: " + a);
		System.out.println("2nd Input: " + b);
		int aa = (int) a;
		int bb = (int) b;
		int c = 1;
		while (aa < bb) {
			a = (char) aa;
			System.out.print(a);
			System.out.print(" ");
			if (c%20==0) {
				System.out.println("");
			}
			aa++;
			c++;
		}
			System.out.println(b);
	}
}