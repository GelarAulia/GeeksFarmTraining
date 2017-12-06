public class _2ColorList {
    public static void main(String[] args) {
        String[] color = {"white","green","red"};
        for (int x = 0;x < color.length;x++) {
        	System.out.print(color[x] + ", ");
        }
        System.out.println("\n");
		for (int x = 1;x <= color.length;x++) {
			if (x == color.length) {
				System.out.println(color[x-color.length]);
				break;
			}
        	System.out.println(color[x]);
        }
    }
}