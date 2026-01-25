package assignment6;

import java.util.ArrayList;

public class bt4 {

    public static void main(String[] args) {
        ArrayList<String> tp = new ArrayList<>();
        tp.add("DaNang");
        tp.add("Seul");
        tp.add("Wasington");
        tp.add("London");
        tp.add("Newyork");
        for (int i = 0; i < tp.size(); i++) {
            if (tp.get(i) != "London") {
            } else {
                System.out.println(true);
            }
        }
    }
}
