package assignment6;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;

public class bt5 {

    public static void main(String[] args) {
        ArrayList<Integer> so = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            so.add(random.nextInt(100) + 1);
        }
        so.remove(3);
        System.out.println(Arrays.toString(so.toArray()));
    }
}
