package assignment6;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class bt10 {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("an");
        name.add("binh");
        name.add("cuong");
        name.add("an");
        name.add("binh");
        name.add("dung");
        LinkedHashSet<String> set = new LinkedHashSet<>(name);
        name.clear();
        name.addAll(set);
        System.out.println("ten: ");
        System.out.println(name);
    }
}
