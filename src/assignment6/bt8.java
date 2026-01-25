package assignment6;

import java.util.ArrayList;

public class bt8 {

    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        ArrayList<String> fruit2 = new ArrayList<>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("mango");
        fruit.add("water melon");
        fruit.add("blue berry");
        for (int i = 0; i < fruit.size(); i++) {
            fruit2.add(fruit.get(i));
        }
        System.out.println("1: "+fruit);
        System.out.println("2: "+fruit2);
    }

}
