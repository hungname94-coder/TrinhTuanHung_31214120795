package assignment6;

import java.util.ArrayList;
import java.util.*;

public class bt12 {

    public static void main(String[] args) {
        ArrayList<Integer> so = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            so.add(random.nextInt(100) + 1);
        }
        int tong = 0;
        for (int i = 0; i < so.size(); i++) {
            tong += so.get(i);
        }
        System.out.println(so);
        System.out.println("tong = " + tong);
    }
}
