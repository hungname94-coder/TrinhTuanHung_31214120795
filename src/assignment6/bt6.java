package assignment6;

import java.util.ArrayList;
import java.util.*;

public class bt6 {

    public static void main(String[] args) {
        ArrayList<Integer> so = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            so.add(random.nextInt(15) + 1);
        }
        int sd1 = 0;
        int sd2 = 0;
        for (int i = 0; i < so.size(); i++) {
            if (so.get(i) % 2 == 0) {
                sd1++;
            } else {
                sd2++;
            }
        }
        System.out.print("co " + sd1 + " so chan va " + sd2 + " so le");
    }
}
