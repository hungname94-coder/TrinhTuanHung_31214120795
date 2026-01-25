package assignment6;

import java.util.ArrayList;
import java.util.*;

public class bt7 {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> so = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            so.add(random.nextInt(100) + 1);
        }
        System.out.println(so);
        for (int i = 0; i < so.size() / 2; i++) {
            int a = so.get(i);
            so.set(i, so.get(so.size() - 1 - i));
            so.set(so.size() - 1 - i, a);
        }
        System.out.println(so);
    }
}
