package assignment6;

import java.util.ArrayList;
import java.util.Arrays;

public class bt2 {

    public static void main(String[] args) {
        ArrayList<String> mau = new ArrayList<>();
        mau.add("red");
        mau.add("blue");
        mau.add("while");
        mau.add("black");
        mau.add("green");
        mau.remove(1);
        mau.add(1, "yellow");
        System.out.println(Arrays.toString(mau.toArray()));
    }
}
