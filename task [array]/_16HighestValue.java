import java.util.*;

public class _16HighestValue {
    public static void main(String[] args) {
    	List<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(5);
        array.add(3);
        array.add(0);
        array.add(8);
        array.add(6);
        array.add(2);
        array.add(4);
        array.add(7);
        array.add(9);
        System.out.println("Array values: " + array.subList(0, array.size()).toString());
        Collections.sort(array);
        if (array.contains(0)) {
            array.remove(0);
        }
        System.out.println("Largest value: " + array.subList(array.size()-1, array.size()).toString());
    }
}