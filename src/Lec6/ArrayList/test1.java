package Lec6.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class test1 {

    public static void main(String[] args) {
        ArrayList<String> n = new ArrayList<>();
        n.add("Hung1");
        n.add("Hung2");
        n.add("Hung3");
        System.out.println("n= " + Arrays.toString(n.toArray()));
        System.out.println("name[0]=" + n.get(0));
        System.out.println(n.remove("Hung2"));
        System.out.println(n.remove(1));
        System.out.println(Arrays.toString(n.toArray()));
    }
}
