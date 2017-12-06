import java.util.*;

public class _9Temperature {
    public static void main(String[] args) {
    	List<Integer> temperature=new ArrayList();
        temperature.add(78);
        temperature.add(60);
        temperature.add(62);
        temperature.add(68);
        temperature.add(71);
        temperature.add(68);
        temperature.add(73);
        temperature.add(85);
        temperature.add(66);
        temperature.add(64);
        temperature.add(76);
        temperature.add(63);
        temperature.add(75);
        temperature.add(76);
        temperature.add(73);
        temperature.add(68);
        temperature.add(62);
        temperature.add(73);
        temperature.add(72);
        temperature.add(65);
        temperature.add(74);
        temperature.add(62);
        temperature.add(62);
        temperature.add(65);
        temperature.add(64);
        temperature.add(68);
        temperature.add(73);
        temperature.add(75);
        temperature.add(79);
        temperature.add(73);
        int total = 0; 
    	double avg; 
    	for (int x = 0; x < temperature.size();x++) {
    		total += temperature.get(x);
    	}
    	avg = total/temperature.size();
    	System.out.println("Average Temperature is: "+avg);
        Collections.sort(temperature);
        System.out.println("List of five lowest temperatures: " + temperature.subList(0, 5));
        System.out.println("List of five highest temperatures: " + temperature.subList(25, 30));
    }
}