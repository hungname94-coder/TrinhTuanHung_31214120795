package assignment6;

import java.util.ArrayList;
import java.util.Random;

public class bt11 {

    public static void main(String[] args) {
        ArrayList<Integer> minmax = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            minmax.add(random.nextInt(100) + 1);
        }
        int min = minmax.get(0);
        int max = minmax.get(0);
        for (int i = 0; i < minmax.size(); i++) {
            if (max > minmax.get(i)) {
                max = minmax.get(i);
            }
            if (min < minmax.get(i)) {
                min = minmax.get(i);
            }
        }
        System.out.println(minmax);
        System.out.println("so lon nhat: " + max);
        System.out.println("so be nhat: " + min);
    }
}
